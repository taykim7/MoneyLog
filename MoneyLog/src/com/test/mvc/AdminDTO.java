package com.test.mvc;

public class AdminDTO
{
	// 관리자 계정
	public String ad_cd, ad_id, ad_pw, ad_date;
	
	// 이용자 정보
	public String user_dstn_cd, user_id, user_name, user_tel, user_date, leave_date
	, ssn, mrg_cd, mrg_yn, child_cd, child_num, fml_cd, fml_num
	, pet_cd, pet_num, car_cd, car_num, house_cd, house_type
	, area_fst_cd, area_fst_name, area_sec_cd, area_sec_name
	, job_fst_cd, job_fst_name, job_sec_cd, job_sec_name;
	
	// 공지사항 등록
	public String rownum, noti_cd, noti_title, noti_cont, noti_date, noti_view, noti_pin;
	
	// 이용자 문의글 등록
	public String qna_cd, qna_title, qna_cont, qna_view, qna_date;
	
	// 관리자 문의글 답변
	public String ad_ansr_cd, ad_ansr, ad_ansr_cont, ad_ansr_date;
	
	// 게시글 등록
	public String post_cd, dtl_select_cd, acnt_ym, post_title, opinion, post_view, post_date;
	
	// 신고 카테고리 분류 
	public String rept_cate_cd, rept_cate_name;
	
	// 게시글 신고등록 
	public String post_rept_cd, post_rept_date;
	
	// 게시글 신고세부사유
	public String post_rept_dtl_cd, post_rept_dtl_cont;
	
	// 관리자 게시글 신고처리
	public String ad_post_rept_cd, ad_post_rept_date;
	
	// 승인 여부
	public String cnfm_cd, cnfm_yn;
	
	// 댓글 등록
	public String cmnt_cd, cmnt_cont, cmnt_date;
	
	// 댓글 신고등록
	public String cmnt_rept_cd, cmnt_rept_date;
	
	// 댓글 신고세부사유
	public String cmnt_rept_dtl_cd, cmnnt_rept_dtl_cont;
	
	// 관리자 댓글 신고처리
	public String ad_cmnt_rept_cd, ad_cmnt_rept_date;
	
	// 게시글 이용자 영구정지
	public String post_ban_cd, post_ban_date;
	
	// 댓글 이용자 영구정지
	public String cmnt_ban_cd, cmnt_ban_date;
	
	
	// getter / setter 구성
	public String getUser_dstn_cd()
	{
		return user_dstn_cd;
	}

	public void setUser_dstn_cd(String user_dstn_cd)
	{
		this.user_dstn_cd = user_dstn_cd;
	}

	public String getUser_id()
	{
		return user_id;
	}

	public void setUser_id(String user_id)
	{
		this.user_id = user_id;
	}

	public String getUser_name()
	{
		return user_name;
	}

	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}

	public String getRownum()
	{
		return rownum;
	}

	public void setRownum(String rownum)
	{
		this.rownum = rownum;
	}

	public String getNoti_cd()
	{
		return noti_cd;
	}

	public void setNoti_cd(String noti_cd)
	{
		this.noti_cd = noti_cd;
	}

	public String getNoti_title()
	{
		return noti_title;
	}

	public void setNoti_title(String noti_title)
	{
		this.noti_title = noti_title;
	}

	public String getNoti_cont()
	{
		return noti_cont;
	}

	public void setNoti_cont(String noti_cont)
	{
		this.noti_cont = noti_cont;
	}

	public String getNoti_date()
	{
		return noti_date;
	}

	public void setNoti_date(String noti_date)
	{
		this.noti_date = noti_date;
	}

	public String getNoti_view()
	{
		return noti_view;
	}

	public void setNoti_view(String noti_view)
	{
		this.noti_view = noti_view;
	}

	public String getNoti_pin()
	{
		return noti_pin;
	}

	public void setNoti_pin(String noti_pin)
	{
		this.noti_pin = noti_pin;
	}

	public String getQna_cd()
	{
		return qna_cd;
	}

	public void setQna_cd(String qna_cd)
	{
		this.qna_cd = qna_cd;
	}

	public String getQna_title()
	{
		return qna_title;
	}

	public void setQna_title(String qna_title)
	{
		this.qna_title = qna_title;
	}

	public String getQna_cont()
	{
		return qna_cont;
	}

	public void setQna_cont(String qna_cont)
	{
		this.qna_cont = qna_cont;
	}

	public String getQna_view()
	{
		return qna_view;
	}

	public void setQna_view(String qna_view)
	{
		this.qna_view = qna_view;
	}

	public String getQna_date()
	{
		return qna_date;
	}

	public void setQna_date(String qna_date)
	{
		this.qna_date = qna_date;
	}

	public String getAd_ansr_cd()
	{
		return ad_ansr_cd;
	}

	public void setAd_ansr_cd(String ad_ansr_cd)
	{
		this.ad_ansr_cd = ad_ansr_cd;
	}

	public String getAd_ansr()
	{
		return ad_ansr;
	}

	public void setAd_ansr(String ad_ansr)
	{
		this.ad_ansr = ad_ansr;
	}

	public String getAd_ansr_cont()
	{
		return ad_ansr_cont;
	}

	public void setAd_ansr_cont(String ad_ansr_cont)
	{
		this.ad_ansr_cont = ad_ansr_cont;
	}

	public String getAd_ansr_date()
	{
		return ad_ansr_date;
	}

	public void setAd_ansr_date(String ad_ansr_date)
	{
		this.ad_ansr_date = ad_ansr_date;
	}

	public String getPost_cd()
	{
		return post_cd;
	}

	public void setPost_cd(String post_cd)
	{
		this.post_cd = post_cd;
	}

	public String getDtl_select_cd()
	{
		return dtl_select_cd;
	}

	public void setDtl_select_cd(String dtl_select_cd)
	{
		this.dtl_select_cd = dtl_select_cd;
	}

	public String getAcnt_ym()
	{
		return acnt_ym;
	}

	public void setAcnt_ym(String acnt_ym)
	{
		this.acnt_ym = acnt_ym;
	}

	public String getPost_title()
	{
		return post_title;
	}

	public void setPost_title(String post_title)
	{
		this.post_title = post_title;
	}

	public String getOpinion()
	{
		return opinion;
	}

	public void setOpinion(String opinion)
	{
		this.opinion = opinion;
	}

	public String getPost_view()
	{
		return post_view;
	}

	public void setPost_view(String post_view)
	{
		this.post_view = post_view;
	}

	public String getPost_date()
	{
		return post_date;
	}

	public void setPost_date(String post_date)
	{
		this.post_date = post_date;
	}

	public String getRept_cate_cd()
	{
		return rept_cate_cd;
	}

	public void setRept_cate_cd(String rept_cate_cd)
	{
		this.rept_cate_cd = rept_cate_cd;
	}

	public String getRept_cate_name()
	{
		return rept_cate_name;
	}

	public void setRept_cate_name(String rept_cate_name)
	{
		this.rept_cate_name = rept_cate_name;
	}

	public String getPost_rept_cd()
	{
		return post_rept_cd;
	}

	public void setPost_rept_cd(String post_rept_cd)
	{
		this.post_rept_cd = post_rept_cd;
	}

	public String getPost_rept_date()
	{
		return post_rept_date;
	}

	public void setPost_rept_date(String post_rept_date)
	{
		this.post_rept_date = post_rept_date;
	}

	public String getPost_rept_dtl_cd()
	{
		return post_rept_dtl_cd;
	}

	public void setPost_rept_dtl_cd(String post_rept_dtl_cd)
	{
		this.post_rept_dtl_cd = post_rept_dtl_cd;
	}

	public String getPost_rept_dtl_cont()
	{
		return post_rept_dtl_cont;
	}

	public void setPost_rept_dtl_cont(String post_rept_dtl_cont)
	{
		this.post_rept_dtl_cont = post_rept_dtl_cont;
	}

	public String getAd_post_rept_cd()
	{
		return ad_post_rept_cd;
	}

	public void setAd_post_rept_cd(String ad_post_rept_cd)
	{
		this.ad_post_rept_cd = ad_post_rept_cd;
	}

	public String getAd_post_rept_date()
	{
		return ad_post_rept_date;
	}

	public void setAd_post_rept_date(String ad_post_rept_date)
	{
		this.ad_post_rept_date = ad_post_rept_date;
	}

	public String getCnfm_cd()
	{
		return cnfm_cd;
	}

	public void setCnfm_cd(String cnfm_cd)
	{
		this.cnfm_cd = cnfm_cd;
	}

	public String getCnfm_yn()
	{
		return cnfm_yn;
	}

	public void setCnfm_yn(String cnfm_yn)
	{
		this.cnfm_yn = cnfm_yn;
	}

	public String getCmnt_cd()
	{
		return cmnt_cd;
	}

	public void setCmnt_cd(String cmnt_cd)
	{
		this.cmnt_cd = cmnt_cd;
	}

	public String getCmnt_cont()
	{
		return cmnt_cont;
	}

	public void setCmnt_cont(String cmnt_cont)
	{
		this.cmnt_cont = cmnt_cont;
	}

	public String getCmnt_date()
	{
		return cmnt_date;
	}

	public void setCmnt_date(String cmnt_date)
	{
		this.cmnt_date = cmnt_date;
	}

	public String getCmnt_rept_cd()
	{
		return cmnt_rept_cd;
	}

	public void setCmnt_rept_cd(String cmnt_rept_cd)
	{
		this.cmnt_rept_cd = cmnt_rept_cd;
	}

	public String getCmnt_rept_date()
	{
		return cmnt_rept_date;
	}

	public void setCmnt_rept_date(String cmnt_rept_date)
	{
		this.cmnt_rept_date = cmnt_rept_date;
	}

	public String getCmnt_rept_dtl_cd()
	{
		return cmnt_rept_dtl_cd;
	}

	public void setCmnt_rept_dtl_cd(String cmnt_rept_dtl_cd)
	{
		this.cmnt_rept_dtl_cd = cmnt_rept_dtl_cd;
	}

	public String getCmnnt_rept_dtl_cont()
	{
		return cmnnt_rept_dtl_cont;
	}

	public void setCmnnt_rept_dtl_cont(String cmnnt_rept_dtl_cont)
	{
		this.cmnnt_rept_dtl_cont = cmnnt_rept_dtl_cont;
	}

	public String getAd_cmnt_rept_cd()
	{
		return ad_cmnt_rept_cd;
	}

	public void setAd_cmnt_rept_cd(String ad_cmnt_rept_cd)
	{
		this.ad_cmnt_rept_cd = ad_cmnt_rept_cd;
	}

	public String getAd_cmnt_rept_date()
	{
		return ad_cmnt_rept_date;
	}

	public void setAd_cmnt_rept_date(String ad_cmnt_rept_date)
	{
		this.ad_cmnt_rept_date = ad_cmnt_rept_date;
	}

	public String getPost_ban_cd()
	{
		return post_ban_cd;
	}

	public void setPost_ban_cd(String post_ban_cd)
	{
		this.post_ban_cd = post_ban_cd;
	}

	public String getPost_ban_date()
	{
		return post_ban_date;
	}

	public void setPost_ban_date(String post_ban_date)
	{
		this.post_ban_date = post_ban_date;
	}

	public String getCmnt_ban_cd()
	{
		return cmnt_ban_cd;
	}

	public void setCmnt_ban_cd(String cmnt_ban_cd)
	{
		this.cmnt_ban_cd = cmnt_ban_cd;
	}

	public String getCmnt_ban_date()
	{
		return cmnt_ban_date;
	}

	public void setCmnt_ban_date(String cmnt_ban_date)
	{
		this.cmnt_ban_date = cmnt_ban_date;
	}

	public String getAd_cd()
	{
		return ad_cd;
	}

	public void setAd_cd(String ad_cd)
	{
		this.ad_cd = ad_cd;
	}

	public String getAd_id()
	{
		return ad_id;
	}

	public void setAd_id(String ad_id)
	{
		this.ad_id = ad_id;
	}

	public String getAd_pw()
	{
		return ad_pw;
	}

	public void setAd_pw(String ad_pw)
	{
		this.ad_pw = ad_pw;
	}

	public String getAd_date()
	{
		return ad_date;
	}

	public void setAd_date(String ad_date)
	{
		this.ad_date = ad_date;
	}
	
	
}
