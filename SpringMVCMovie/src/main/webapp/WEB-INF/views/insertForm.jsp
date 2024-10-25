<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MVC Example</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div class="container mt-5">
        <div class="text-center">
            <img src="resources/image/f5.jpg" alt="Cinema Image" class="img-fluid mb-4" style="max-width: 400px;">
            <h1 class="mb-4">새글쓰기</h1>
        </div>
        <div class="row justify-content-center">
            <div class="col-md-6">
                <form action="insertProcess" method="post">
                    <div class="form-group">
                        <label for="cinemaCode">영화관 선택:</label>
                        <select name="cinemaCode" class="form-control" aria-label="Cinema Select">
                            <option value="0">s시네마, 서울</option>
                            <option value="1">G시네마, 광주</option>
                            <option value="2">B시네마, 부산</option>
                            <option value="3">i시네마, 인천</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="title">제목:</label>
                        <input type="text" class="form-control" name="title" id="title" placeholder="영화 제목을 입력하세요">
                    </div>
                    <div class="form-group">
                        <label for="releaseDate">개봉 날짜:</label>
                        <input type="date" class="form-control" name="releaseDate" id="releaseDate">
                    </div>
                    <div class="form-group">
                        <label for="runningTime">러닝타임 (분):</label>
                        <input type="number" class="form-control" name="runningTime" id="runningTime" placeholder="예: 120">
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-primary btn-block">등록</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
