package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WithdrawalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WithdrawalExample() {
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

        public Criteria andDrawidIsNull() {
            addCriterion("drawid is null");
            return (Criteria) this;
        }

        public Criteria andDrawidIsNotNull() {
            addCriterion("drawid is not null");
            return (Criteria) this;
        }

        public Criteria andDrawidEqualTo(Integer value) {
            addCriterion("drawid =", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotEqualTo(Integer value) {
            addCriterion("drawid <>", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidGreaterThan(Integer value) {
            addCriterion("drawid >", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drawid >=", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidLessThan(Integer value) {
            addCriterion("drawid <", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidLessThanOrEqualTo(Integer value) {
            addCriterion("drawid <=", value, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidIn(List<Integer> values) {
            addCriterion("drawid in", values, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotIn(List<Integer> values) {
            addCriterion("drawid not in", values, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidBetween(Integer value1, Integer value2) {
            addCriterion("drawid between", value1, value2, "drawid");
            return (Criteria) this;
        }

        public Criteria andDrawidNotBetween(Integer value1, Integer value2) {
            addCriterion("drawid not between", value1, value2, "drawid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyIsNull() {
            addCriterion("drawmoney is null");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyIsNotNull() {
            addCriterion("drawmoney is not null");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyEqualTo(Double value) {
            addCriterion("drawmoney =", value, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyNotEqualTo(Double value) {
            addCriterion("drawmoney <>", value, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyGreaterThan(Double value) {
            addCriterion("drawmoney >", value, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("drawmoney >=", value, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyLessThan(Double value) {
            addCriterion("drawmoney <", value, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyLessThanOrEqualTo(Double value) {
            addCriterion("drawmoney <=", value, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyIn(List<Double> values) {
            addCriterion("drawmoney in", values, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyNotIn(List<Double> values) {
            addCriterion("drawmoney not in", values, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyBetween(Double value1, Double value2) {
            addCriterion("drawmoney between", value1, value2, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawmoneyNotBetween(Double value1, Double value2) {
            addCriterion("drawmoney not between", value1, value2, "drawmoney");
            return (Criteria) this;
        }

        public Criteria andDrawtimeIsNull() {
            addCriterion("drawtime is null");
            return (Criteria) this;
        }

        public Criteria andDrawtimeIsNotNull() {
            addCriterion("drawtime is not null");
            return (Criteria) this;
        }

        public Criteria andDrawtimeEqualTo(Date value) {
            addCriterionForJDBCDate("drawtime =", value, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("drawtime <>", value, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("drawtime >", value, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("drawtime >=", value, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeLessThan(Date value) {
            addCriterionForJDBCDate("drawtime <", value, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("drawtime <=", value, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeIn(List<Date> values) {
            addCriterionForJDBCDate("drawtime in", values, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("drawtime not in", values, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("drawtime between", value1, value2, "drawtime");
            return (Criteria) this;
        }

        public Criteria andDrawtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("drawtime not between", value1, value2, "drawtime");
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