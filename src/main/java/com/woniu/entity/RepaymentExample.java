package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentExample() {
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

        public Criteria andRepayidIsNull() {
            addCriterion("repayid is null");
            return (Criteria) this;
        }

        public Criteria andRepayidIsNotNull() {
            addCriterion("repayid is not null");
            return (Criteria) this;
        }

        public Criteria andRepayidEqualTo(Integer value) {
            addCriterion("repayid =", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidNotEqualTo(Integer value) {
            addCriterion("repayid <>", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidGreaterThan(Integer value) {
            addCriterion("repayid >", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayid >=", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidLessThan(Integer value) {
            addCriterion("repayid <", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidLessThanOrEqualTo(Integer value) {
            addCriterion("repayid <=", value, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidIn(List<Integer> values) {
            addCriterion("repayid in", values, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidNotIn(List<Integer> values) {
            addCriterion("repayid not in", values, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidBetween(Integer value1, Integer value2) {
            addCriterion("repayid between", value1, value2, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepayidNotBetween(Integer value1, Integer value2) {
            addCriterion("repayid not between", value1, value2, "repayid");
            return (Criteria) this;
        }

        public Criteria andRepaynameIsNull() {
            addCriterion("repayname is null");
            return (Criteria) this;
        }

        public Criteria andRepaynameIsNotNull() {
            addCriterion("repayname is not null");
            return (Criteria) this;
        }

        public Criteria andRepaynameEqualTo(String value) {
            addCriterion("repayname =", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameNotEqualTo(String value) {
            addCriterion("repayname <>", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameGreaterThan(String value) {
            addCriterion("repayname >", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameGreaterThanOrEqualTo(String value) {
            addCriterion("repayname >=", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameLessThan(String value) {
            addCriterion("repayname <", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameLessThanOrEqualTo(String value) {
            addCriterion("repayname <=", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameLike(String value) {
            addCriterion("repayname like", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameNotLike(String value) {
            addCriterion("repayname not like", value, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameIn(List<String> values) {
            addCriterion("repayname in", values, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameNotIn(List<String> values) {
            addCriterion("repayname not in", values, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameBetween(String value1, String value2) {
            addCriterion("repayname between", value1, value2, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaynameNotBetween(String value1, String value2) {
            addCriterion("repayname not between", value1, value2, "repayname");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyIsNull() {
            addCriterion("repaymoney is null");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyIsNotNull() {
            addCriterion("repaymoney is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyEqualTo(Double value) {
            addCriterion("repaymoney =", value, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyNotEqualTo(Double value) {
            addCriterion("repaymoney <>", value, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyGreaterThan(Double value) {
            addCriterion("repaymoney >", value, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("repaymoney >=", value, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyLessThan(Double value) {
            addCriterion("repaymoney <", value, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyLessThanOrEqualTo(Double value) {
            addCriterion("repaymoney <=", value, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyIn(List<Double> values) {
            addCriterion("repaymoney in", values, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyNotIn(List<Double> values) {
            addCriterion("repaymoney not in", values, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyBetween(Double value1, Double value2) {
            addCriterion("repaymoney between", value1, value2, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaymoneyNotBetween(Double value1, Double value2) {
            addCriterion("repaymoney not between", value1, value2, "repaymoney");
            return (Criteria) this;
        }

        public Criteria andRepaytimeIsNull() {
            addCriterion("repaytime is null");
            return (Criteria) this;
        }

        public Criteria andRepaytimeIsNotNull() {
            addCriterion("repaytime is not null");
            return (Criteria) this;
        }

        public Criteria andRepaytimeEqualTo(Date value) {
            addCriterionForJDBCDate("repaytime =", value, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("repaytime <>", value, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("repaytime >", value, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repaytime >=", value, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeLessThan(Date value) {
            addCriterionForJDBCDate("repaytime <", value, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repaytime <=", value, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeIn(List<Date> values) {
            addCriterionForJDBCDate("repaytime in", values, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("repaytime not in", values, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repaytime between", value1, value2, "repaytime");
            return (Criteria) this;
        }

        public Criteria andRepaytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repaytime not between", value1, value2, "repaytime");
            return (Criteria) this;
        }

        public Criteria andWalletidIsNull() {
            addCriterion("walletid is null");
            return (Criteria) this;
        }

        public Criteria andWalletidIsNotNull() {
            addCriterion("walletid is not null");
            return (Criteria) this;
        }

        public Criteria andWalletidEqualTo(Integer value) {
            addCriterion("walletid =", value, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidNotEqualTo(Integer value) {
            addCriterion("walletid <>", value, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidGreaterThan(Integer value) {
            addCriterion("walletid >", value, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidGreaterThanOrEqualTo(Integer value) {
            addCriterion("walletid >=", value, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidLessThan(Integer value) {
            addCriterion("walletid <", value, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidLessThanOrEqualTo(Integer value) {
            addCriterion("walletid <=", value, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidIn(List<Integer> values) {
            addCriterion("walletid in", values, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidNotIn(List<Integer> values) {
            addCriterion("walletid not in", values, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidBetween(Integer value1, Integer value2) {
            addCriterion("walletid between", value1, value2, "walletid");
            return (Criteria) this;
        }

        public Criteria andWalletidNotBetween(Integer value1, Integer value2) {
            addCriterion("walletid not between", value1, value2, "walletid");
            return (Criteria) this;
        }

        public Criteria andBorrowidIsNull() {
            addCriterion("borrowid is null");
            return (Criteria) this;
        }

        public Criteria andBorrowidIsNotNull() {
            addCriterion("borrowid is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowidEqualTo(Integer value) {
            addCriterion("borrowid =", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotEqualTo(Integer value) {
            addCriterion("borrowid <>", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThan(Integer value) {
            addCriterion("borrowid >", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowid >=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThan(Integer value) {
            addCriterion("borrowid <", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThanOrEqualTo(Integer value) {
            addCriterion("borrowid <=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidIn(List<Integer> values) {
            addCriterion("borrowid in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotIn(List<Integer> values) {
            addCriterion("borrowid not in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidBetween(Integer value1, Integer value2) {
            addCriterion("borrowid between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowid not between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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