package com.project.passbook.DataObject;

import java.util.ArrayList;
import java.util.List;

public class MerchantsDoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public MerchantsDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNull() {
            addCriterion("business_license_url is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIsNotNull() {
            addCriterion("business_license_url is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlEqualTo(String value) {
            addCriterion("business_license_url =", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotEqualTo(String value) {
            addCriterion("business_license_url <>", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThan(String value) {
            addCriterion("business_license_url >", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_url >=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThan(String value) {
            addCriterion("business_license_url <", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLessThanOrEqualTo(String value) {
            addCriterion("business_license_url <=", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlLike(String value) {
            addCriterion("business_license_url like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotLike(String value) {
            addCriterion("business_license_url not like", value, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlIn(List<String> values) {
            addCriterion("business_license_url in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotIn(List<String> values) {
            addCriterion("business_license_url not in", values, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlBetween(String value1, String value2) {
            addCriterion("business_license_url between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseUrlNotBetween(String value1, String value2) {
            addCriterion("business_license_url not between", value1, value2, "businessLicenseUrl");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNull() {
            addCriterion("is_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNotNull() {
            addCriterion("is_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEqualTo(Boolean value) {
            addCriterion("is_audit =", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotEqualTo(Boolean value) {
            addCriterion("is_audit <>", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThan(Boolean value) {
            addCriterion("is_audit >", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_audit >=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThan(Boolean value) {
            addCriterion("is_audit <", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("is_audit <=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditIn(List<Boolean> values) {
            addCriterion("is_audit in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotIn(List<Boolean> values) {
            addCriterion("is_audit not in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("is_audit between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_audit not between", value1, value2, "isAudit");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table merchants
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 22 00:00:06 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table merchants
     *
     * @mbg.generated Tue Jun 22 00:00:06 CST 2021
     */
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