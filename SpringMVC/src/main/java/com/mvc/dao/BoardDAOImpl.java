package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mvc.util.DBUtil;
import com.mvc.vo.Board;

//BoardDAO의 메소드를 구현한 객체
// BoardService에서 들어온 요청을 처리
// db작업을 수행함 (crud) / jdbc사용함 -> DBUtil사용하기

@Repository
public class BoardDAOImpl implements BoardDAO {
	// DBUtil 사용이 필요함
	@Autowired
	DataSource pool;
	//DBUtil util;

//	public BoardDAOImpl() {
//		util = DBUtil.getInstance(); // 싱글톤이기때문에 직접 new할수는 없음_getInstance하기
//	}

	@Override
	public ArrayList<Board> selectAll() {
		// 결과 담을 곳
		ArrayList<Board> list = new ArrayList<>();
		String q = "select num, name, wdate, title, count from board order by num desc";

		try {
			Connection con = pool.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);
			while (rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String wdate = rs.getString(3);
				String title = rs.getString(4);
				int count = rs.getInt(5);

				Board b = new Board(num, name, wdate, title, count); // 생성자 하나 더 추가하기!!
				list.add(b);
			}

			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println(list.size());// 개수 확인
		return list;
	}

	@Override
	public Board selectOne(String num) {
		Board b = null;
		String q = "select num, name, wdate, title, count, content from board where num=?";

		try {
			Connection con = pool.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			stat.setString(1, num);

			ResultSet rs = stat.executeQuery();
			rs.next(); // 결과가 1건이므로 한번만 호출

			num = rs.getString(1);
			String name = rs.getString(2);
			String wdate = rs.getString(3);
			String title = rs.getString(4);
			int count = rs.getInt(5);
			String content = rs.getString(6);

			b = new Board(num, null, name, wdate, title, content, count);

			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public int insert(Board b) {
		// String pass, String name, String title, String content
		String q = "insert into board(pass,name,wdate,title,content,count) values(?,?,sysdate(),?,?,0);";

		int res = -1;
		
		try {
			Connection con = pool.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			stat.setString(1, b.getPass());
			stat.setString(2, b.getName());
			stat.setString(3, b.getTitle());
			stat.setString(4, b.getContent());

			res = stat.executeUpdate();

			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("데이터 삽입 완료!");
		return res;

	}

	@Override
	public void delete(String n) {
		String q = "delete from board where num = ?";

		try {
			Connection con = pool.getConnection();
			PreparedStatement stat = con.prepareStatement(q);
			stat.setString(1, n);

			stat.executeUpdate();

			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("데이터 삭제 완료!");

	}

	@Override
	public void countUp(String num) {
		Board b = null;
		String q = "update board set count=? where num=?";

		try {
			b = selectOne(num);
			int nowCnt = b.getCount() + 1;

			Connection con = pool.getConnection();
			PreparedStatement stat = con.prepareStatement(q);

			stat.setInt(1, nowCnt);
			stat.setString(2, num);
			stat.executeUpdate();

			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<Board> search(String type, String word) {
		// 결과 담을 곳
		ArrayList<Board> list = new ArrayList<>();
		String q = "select num, name, wdate, title, count from board where "+type+" like '%"+word+"%' order by num desc";
		
		
		System.out.println("word -> "+word+"typo-"+type);
		try {
			Connection con = pool.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);
			
			while (rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String wdate = rs.getString(3);
				String title = rs.getString(4);
				int count = rs.getInt(5);

				Board b = new Board(num, name, wdate, title, count); // 생성자 하나 더 추가하기!!
				list.add(b);
			}

			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println(list.size());// 개수 확인
		return list;

	}

}
