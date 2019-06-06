package com.swyt.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrainCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainCertificateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdIsNull() {
            addCriterion("COMPANY_COLLIERY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdIsNotNull() {
            addCriterion("COMPANY_COLLIERY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdEqualTo(String value) {
            addCriterion("COMPANY_COLLIERY_ID =", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdNotEqualTo(String value) {
            addCriterion("COMPANY_COLLIERY_ID <>", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdGreaterThan(String value) {
            addCriterion("COMPANY_COLLIERY_ID >", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_COLLIERY_ID >=", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdLessThan(String value) {
            addCriterion("COMPANY_COLLIERY_ID <", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_COLLIERY_ID <=", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdLike(String value) {
            addCriterion("COMPANY_COLLIERY_ID like", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdNotLike(String value) {
            addCriterion("COMPANY_COLLIERY_ID not like", value, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdIn(List<String> values) {
            addCriterion("COMPANY_COLLIERY_ID in", values, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdNotIn(List<String> values) {
            addCriterion("COMPANY_COLLIERY_ID not in", values, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdBetween(String value1, String value2) {
            addCriterion("COMPANY_COLLIERY_ID between", value1, value2, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCompanyCollieryIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_COLLIERY_ID not between", value1, value2, "companyCollieryId");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNull() {
            addCriterion("CERTIFICATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNotNull() {
            addCriterion("CERTIFICATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME =", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME <>", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThan(String value) {
            addCriterion("CERTIFICATE_NAME >", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME >=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThan(String value) {
            addCriterion("CERTIFICATE_NAME <", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME <=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLike(String value) {
            addCriterion("CERTIFICATE_NAME like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotLike(String value) {
            addCriterion("CERTIFICATE_NAME not like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIn(List<String> values) {
            addCriterion("CERTIFICATE_NAME in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NAME not in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NAME between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NAME not between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNull() {
            addCriterion("CERTIFICATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNotNull() {
            addCriterion("CERTIFICATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER =", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER <>", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThan(String value) {
            addCriterion("CERTIFICATE_NUMBER >", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER >=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThan(String value) {
            addCriterion("CERTIFICATE_NUMBER <", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER <=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLike(String value) {
            addCriterion("CERTIFICATE_NUMBER like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotLike(String value) {
            addCriterion("CERTIFICATE_NUMBER not like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIn(List<String> values) {
            addCriterion("CERTIFICATE_NUMBER in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NUMBER not in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NUMBER between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NUMBER not between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityIsNull() {
            addCriterion("CERTIFICATE_AUTHORITY is null");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityIsNotNull() {
            addCriterion("CERTIFICATE_AUTHORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityEqualTo(String value) {
            addCriterion("CERTIFICATE_AUTHORITY =", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityNotEqualTo(String value) {
            addCriterion("CERTIFICATE_AUTHORITY <>", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityGreaterThan(String value) {
            addCriterion("CERTIFICATE_AUTHORITY >", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_AUTHORITY >=", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityLessThan(String value) {
            addCriterion("CERTIFICATE_AUTHORITY <", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_AUTHORITY <=", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityLike(String value) {
            addCriterion("CERTIFICATE_AUTHORITY like", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityNotLike(String value) {
            addCriterion("CERTIFICATE_AUTHORITY not like", value, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityIn(List<String> values) {
            addCriterion("CERTIFICATE_AUTHORITY in", values, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityNotIn(List<String> values) {
            addCriterion("CERTIFICATE_AUTHORITY not in", values, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_AUTHORITY between", value1, value2, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateAuthorityNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_AUTHORITY not between", value1, value2, "certificateAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateIsNull() {
            addCriterion("CERTIFICATE_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateIsNotNull() {
            addCriterion("CERTIFICATE_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE =", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE <>", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE >", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE >=", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE <", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE <=", value, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE in", values, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE not in", values, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE between", value1, value2, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CERTIFICATE_BEGIN_DATE not between", value1, value2, "certificateBeginDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateIsNull() {
            addCriterion("CERTIFICATE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateIsNotNull() {
            addCriterion("CERTIFICATE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE =", value, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE <>", value, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE >", value, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE >=", value, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateLessThan(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE <", value, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE <=", value, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE in", values, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE not in", values, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE between", value1, value2, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CERTIFICATE_END_DATE not between", value1, value2, "certificateEndDate");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdIsNull() {
            addCriterion("CERTIFICATE_HOLDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdIsNotNull() {
            addCriterion("CERTIFICATE_HOLDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdEqualTo(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID =", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdNotEqualTo(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID <>", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdGreaterThan(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID >", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID >=", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdLessThan(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID <", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID <=", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdLike(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID like", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdNotLike(String value) {
            addCriterion("CERTIFICATE_HOLDER_ID not like", value, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdIn(List<String> values) {
            addCriterion("CERTIFICATE_HOLDER_ID in", values, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdNotIn(List<String> values) {
            addCriterion("CERTIFICATE_HOLDER_ID not in", values, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_HOLDER_ID between", value1, value2, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andCertificateHolderIdNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_HOLDER_ID not between", value1, value2, "certificateHolderId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNull() {
            addCriterion("DEL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNotNull() {
            addCriterion("DEL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlgEqualTo(Boolean value) {
            addCriterion("DEL_FLG =", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotEqualTo(Boolean value) {
            addCriterion("DEL_FLG <>", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThan(Boolean value) {
            addCriterion("DEL_FLG >", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DEL_FLG >=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThan(Boolean value) {
            addCriterion("DEL_FLG <", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThanOrEqualTo(Boolean value) {
            addCriterion("DEL_FLG <=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgIn(List<Boolean> values) {
            addCriterion("DEL_FLG in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotIn(List<Boolean> values) {
            addCriterion("DEL_FLG not in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgBetween(Boolean value1, Boolean value2) {
            addCriterion("DEL_FLG between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DEL_FLG not between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNull() {
            addCriterion("INSERT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNotNull() {
            addCriterion("INSERT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdEqualTo(String value) {
            addCriterion("INSERT_USER_ID =", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotEqualTo(String value) {
            addCriterion("INSERT_USER_ID <>", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThan(String value) {
            addCriterion("INSERT_USER_ID >", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSERT_USER_ID >=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThan(String value) {
            addCriterion("INSERT_USER_ID <", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThanOrEqualTo(String value) {
            addCriterion("INSERT_USER_ID <=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLike(String value) {
            addCriterion("INSERT_USER_ID like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotLike(String value) {
            addCriterion("INSERT_USER_ID not like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIn(List<String> values) {
            addCriterion("INSERT_USER_ID in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotIn(List<String> values) {
            addCriterion("INSERT_USER_ID not in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdBetween(String value1, String value2) {
            addCriterion("INSERT_USER_ID between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotBetween(String value1, String value2) {
            addCriterion("INSERT_USER_ID not between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNull() {
            addCriterion("INSERT_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNotNull() {
            addCriterion("INSERT_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeEqualTo(Date value) {
            addCriterion("INSERT_DATETIME =", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotEqualTo(Date value) {
            addCriterion("INSERT_DATETIME <>", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThan(Date value) {
            addCriterion("INSERT_DATETIME >", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_DATETIME >=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThan(Date value) {
            addCriterion("INSERT_DATETIME <", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_DATETIME <=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIn(List<Date> values) {
            addCriterion("INSERT_DATETIME in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotIn(List<Date> values) {
            addCriterion("INSERT_DATETIME not in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeBetween(Date value1, Date value2) {
            addCriterion("INSERT_DATETIME between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_DATETIME not between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("UPDATE_USER_ID like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("UPDATE_USER_ID not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}