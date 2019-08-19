package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditExample() {
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

        public Criteria andCreditidIsNull() {
            addCriterion("creditid is null");
            return (Criteria) this;
        }

        public Criteria andCreditidIsNotNull() {
            addCriterion("creditid is not null");
            return (Criteria) this;
        }

        public Criteria andCreditidEqualTo(Integer value) {
            addCriterion("creditid =", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotEqualTo(Integer value) {
            addCriterion("creditid <>", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidGreaterThan(Integer value) {
            addCriterion("creditid >", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditid >=", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidLessThan(Integer value) {
            addCriterion("creditid <", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidLessThanOrEqualTo(Integer value) {
            addCriterion("creditid <=", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidIn(List<Integer> values) {
            addCriterion("creditid in", values, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotIn(List<Integer> values) {
            addCriterion("creditid not in", values, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidBetween(Integer value1, Integer value2) {
            addCriterion("creditid between", value1, value2, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotBetween(Integer value1, Integer value2) {
            addCriterion("creditid not between", value1, value2, "creditid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCredittimeIsNull() {
            addCriterion("credittime is null");
            return (Criteria) this;
        }

        public Criteria andCredittimeIsNotNull() {
            addCriterion("credittime is not null");
            return (Criteria) this;
        }

        public Criteria andCredittimeEqualTo(Date value) {
            addCriterionForJDBCDate("credittime =", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("credittime <>", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("credittime >", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("credittime >=", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeLessThan(Date value) {
            addCriterionForJDBCDate("credittime <", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("credittime <=", value, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeIn(List<Date> values) {
            addCriterionForJDBCDate("credittime in", values, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("credittime not in", values, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("credittime between", value1, value2, "credittime");
            return (Criteria) this;
        }

        public Criteria andCredittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("credittime not between", value1, value2, "credittime");
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