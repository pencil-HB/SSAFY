package com.board;

public class FreeBoard implements Board {

	@Override // after - 글을 1개 읽었습니다.
	public String read(int num) {
		System.out.println("글 읽는 중...");
		return "글내용"+1;
	}

	@Override // 비포 - 로그인 체크를 진행합니다
	public void delete(int num) {
		System.out.println("..."+num+"번 게시글을 삭제합니다.");
	}

	@Override //비포 - 로그인 체크를 진행합니다
	public void write(int num) {
		System.out.println("..."+num+"번 게시글을 작성합니다.");
	}

}
