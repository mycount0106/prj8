package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InvestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestExample() {
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

        public Criteria andInvertidIsNull() {
            addCriterion("invertid is null");
            return (Criteria) this;
        }

        public Criteria andInvertidIsNotNull() {
            addCriterion("invertid is not null");
            return (Criteria) this;
        }

        public Criteria andInvertidEqualTo(Integer value) {
            addCriterion("invertid =", value, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidNotEqualTo(Integer value) {
            addCriterion("invertid <>", value, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidGreaterThan(Integer value) {
            addCriterion("invertid >", value, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invertid >=", value, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidLessThan(Integer value) {
            addCriterion("invertid <", value, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidLessThanOrEqualTo(Integer value) {
            addCriterion("invertid <=", value, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidIn(List<Integer> values) {
            addCriterion("invertid in", values, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidNotIn(List<Integer> values) {
            addCriterion("invertid not in", values, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidBetween(Integer value1, Integer value2) {
            addCriterion("invertid between", value1, value2, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvertidNotBetween(Integer value1, Integer value2) {
            addCriterion("invertid not between", value1, value2, "invertid");
            return (Criteria) this;
        }

        public Criteria andInvestnameIsNull() {
            addCriterion("investname is null");
            return (Criteria) this;
        }

        public Criteria andInvestnameIsNotNull() {
            addCriterion("investname is not null");
            return (Criteria) this;
        }

        public Criteria andInvestnameEqualTo(String value) {
            addCriterion("investname =", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotEqualTo(String value) {
            addCriterion("investname <>", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameGreaterThan(String value) {
            addCriterion("investname >", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameGreaterThanOrEqualTo(String value) {
            addCriterion("investname >=", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameLessThan(String value) {
            addCriterion("investname <", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameLessThanOrEqualTo(String value) {
            addCriterion("investname <=", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameLike(String value) {
            addCriterion("investname like", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotLike(String value) {
            addCriterion("investname not like", value, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameIn(List<String> values) {
            addCriterion("investname in", values, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotIn(List<String> values) {
            addCriterion("investname not in", values, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameBetween(String value1, String value2) {
            addCriterion("investname between", value1, value2, "investname");
            return (Criteria) this;
        }

        public Criteria andInvestnameNotBetween(String value1, String value2) {
            addCriterion("investname not between", value1, value2, "investname");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andInvesttimeIsNull() {
            addCriterion("investtime is null");
            return (Criteria) this;
        }

        public Criteria andInvesttimeIsNotNull() {
            addCriterion("investtime is not null");
            return (Criteria) this;
        }

        public Criteria andInvesttimeEqualTo(Date value) {
            addCriterionForJDBCDate("investtime =", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("investtime <>", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("investtime >", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("investtime >=", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeLessThan(Date value) {
            addCriterionForJDBCDate("investtime <", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("investtime <=", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeIn(List<Date> values) {
            addCriterionForJDBCDate("investtime in", values, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("investtime not in", values, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("investtime between", value1, value2, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("investtime not between", value1, value2, "investtime");
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