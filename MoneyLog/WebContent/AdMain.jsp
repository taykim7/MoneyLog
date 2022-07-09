<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<%
		// 월 신규 회원 수
		int data1 = 434;
		int data2 = 534;
		int data3 = 734;
		int data4 = 934;
		int data5 = 1134;
		int data6 = 1334;
		int data7 = 1634;
		int data8 = 1734;
		int data9 = 1634;
		int data10 = 1434;
		int data11 = 2134;
		int data12 = 2934;
		
		// 월 탈퇴 회원 수
		int ldata1 = 44;
		int ldata2 = 34;
		int ldata3 = 74;
		int ldata4 = 34;
		int ldata5 = 34;
		int ldata6 = 134;
		int ldata7 = 34;
		int ldata8 = 734;
		int ldata9 = 634;
		int ldata10 = 434;
		int ldata11 = 134;
		int ldata12 = 34;
	
%>

<!DOCTYPE html>
<html>
<head>
<title>커뮤니티 웹 사이트</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/admin.css">
</head>
<body>
    <div class="wrap">
        <!-- ○ 상단 네비게이션 include -->
        <header>
            <jsp:include page="./AdNavManage.jsp"></jsp:include>
        </header>	

        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span2">
                    <!-- ○ 좌측 메뉴바 include -->
                    <jsp:include page="./AdMenuMain.jsp"></jsp:include>

                </div>

                <div class="span10">
                    <!-- 오늘의 할일 -->
                    <main>
                        <section>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="list-group">
                                        <br>
                                        <h4>오늘의 할일<small>  오늘 접수된 신고와 문의사항입니다.</small></h4>
                                        <div class="list-group-item">
                                            <div class="row m-1">
            
                                                <!-- 이미지 -->
                                                <div class="col-md-4 text-center p-5">
                                                    <a href="AdPostReptList.jsp"><img src="./img/event.svg"></a>
                                                    <h3>${countPostRept }</h3>
                                                    <h5>미처리된 게시글 신고</h5>
                                                </div>
                                                
                                                <!-- 이미지 -->
                                                <div class="col-md-4 text-center p-5">
                                                    <a href="AdCmntReptList.jsp"><img src="./img/event.svg"></a>
                                                    <h3>${countCmntRept }</h3>
                                                    <h5>미처리된 댓글 신고</h5>
                                                </div>
            
                                                <!-- 이미지 -->
                                                <div class="col-md-4 text-center p-5">
                                                    <a href="AdQnaList.jsp"><img src="./img/edit.svg"></a>
                                                    <h3>${countQna }</h3>
                                                    <h5>미답변된 문의</h5>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
    
                        <!-- 공지사항 리스트 -->
                        <section>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="list-group">
                                        <br><br>
                                        <h4>공지사항<small> 페이지를 관리하세요.</small></h4>
            
                                        <div class="list-group-item">
                                            <div class="list-group table-container">
                                                <table class="table ad-main-table">
                                                    <tbody>
								                                           	
                                                        <!-- 게시글 -->
                                                        <tr>
                                                            <th class="number-column mobile" >번호</th>
                                                            <th style="text-align: center;">제목</th>
                                                            <th class="mobile" style="width: 120px; text-align: center;">작성일</th>
                                                        </tr>
                                                        
                                                        <!-- UserDAO.xml에서 userNotiList 로 가져오긴하는데 따로 만들어서 필요한거만 select하기 -->
                                                        
                                                       	<!-- 
                                                        <c:if test="${empty userNotiList}">
														<tr>
															<td colspan="3" style="text-align: center;">등록된 공지사항이 없습니다.</td>
														</tr>
														</c:if>
														
														
														<c:if test="${not empty userNotiList}">
										                <c:forEach var="userNoti" items="${userNotiList }" varStatus="status">
										                <tr>
											                <td class="number-column mobile"><%-- ${fn:length(userNotiList) - status.index }--%></td>
											                <td><a href="./boardView.html">${userNoti.noti_title }</a></td>
											                <td class="mobile">
											                	<fmt:parseDate value="${userNoti.noti_date }" var="noti_date" pattern="yyyy-mm-dd" />
																<fmt:formatDate value="${noti_date}" pattern="yyyy-mm-dd" />
											                </td>
														</tr>
														</c:forEach>
														</c:if>
														-->
														
														<!-- 
                                                        <tr>
                                                            <td class="number-column mobile">3</td>
                                                            <td>머니로그 신규 업데이트 안내 (3.321 패치)</td>
                                                            <td class="mobile">2022-06-05</td>
                                                        </tr>
                                                        -->
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
    
                        <!-- 신규회원 현황 -->
                        <section>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="list-group mt-3">
                                        <!-- <a href="#" class="list-group-item active">신규 회원</a> -->
                                        <br><br>
                                        <h4>회원 현황<small>  머니로그 신규 회원과 총 회원을 확인해보세요.</small></h4>
                
                                        <div class="list-group-item">
                                            <canvas id="lineChart"></canvas>
                                        </div>
                
                                    </div>
                                </div>
                            </div>
    
                            <div class="row mb-5">
                                <div class="col-md-6">
                                    <div class="list-group">
                                        <!-- <a href="#" class="list-group-item active">회원 현황</a> -->
                                        <br><br>
                                        <h4>신규회원 현황<small></small></h4>
                
                                        <div class="list-group-item">
                                            <div class="list-group  table-container">
                                                <table class="table ad-main-table">
                                                    <tbody>
                                                    
                                                        <!-- 게시글 -->
                                                        <tr>
                                                            <th class="member-column" >전체 회원</th>
                                                            <th class="member-column mobile" >신규 회원</th>
                                                            <th class="member-column mobile">정지 회원</th>
                                                        </tr>
                                                        
                                                        <tr>
                                                            <td class="member-column">3,302</td>
                                                            <td class="member-column mobile">21</td>
                                                            <td class="member-column mobile">33</td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="col-md-6">
        
                                    <div class="list-group">
                                        <!-- <a href="#" class="list-group-item active">머니리뷰 현황</a> -->
                                        <br><br>
                                        <h4>머니로그 현황<small></small></h4>
                
                                        <div class="list-group-item">
                                            <div class="list-group  table-container">
                                                <table class="table ad-main-table">
                                                    <tbody>
                                                    
                                                        <!-- 게시글 -->
                                                        <tr>
                                                            <th class="post-column" >전체 게시글</th>
                                                            <th class="post-column mobile" >신규 게시글</th>
                                                            <th class="post-column mobile" >비공개 게시글</th>
                                                            <th class="post-column mobile" >비공개 댓글</th>
                                                        </tr>
                                                        
                                                        <tr>
                                                            <td class="post-column" >3,302</td>
                                                            <td class="post-column mobile" >21</td>
                                                            <td class="post-column mobile" >33</td>
                                                            <td class="post-column mobile" >33</td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                    </main>
                </div>
            </div>
        </div>
    </div>

	<script src="./js/jquery-3.2.1.min.js"></script>
	<script src="./js/popper.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/mdb.min.js"></script>
	
	<script>
		
		var ctxL = document.getElementById("lineChart").getContext('2d');
		var myLineChart = new Chart(ctxL,
		{
			type : 'line',
			data :
			{
				labels : [ "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" ],
				datasets : [
				{
					label : "신규 회원 수",
					fillColor : "rgba(220,220,220,0.2)",
					strokeColor : "rgba(220,220,220,1)",
					pointColor : "rgba(220,220,220,1)",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "rgba(220,220,220,1)",
					data : [ <%=data1%>, <%=data2%>, <%=data3%>, <%=data4%>, <%=data5%>, <%=data6%>, <%=data7%>, <%=data8%>, <%=data9%>, <%=data10%>, <%=data11%>, <%=data12%> ]
				},
				{
					label : "탈퇴 회원 수",
					fillColor : "rgba(151,187,205,0.2)",
					strokeColor : "rgba(151,187,205,1)",
					pointColor : "rgba(151,187,205,1)",
					pointStrokeColor : "#fff",
					pointHighlightFill : "#fff",
					pointHighlightStroke : "rgba(151,187,205,1)",
					data : [ <%=ldata1%>, <%=ldata2%>, <%=ldata3%>, <%=ldata4%>, <%=ldata5%>, <%=ldata6%>, <%=ldata7%>, <%=ldata8%>, <%=ldata9%>, <%=ldata10%>, <%=ldata11%>, <%=ldata12%> ]
				} ]
			},
			options :
			{
				responsive : true
			}
		});
	</script>

</body>
</html>