package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeExample() {
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

        public Criteria andExchangeidIsNull() {
            addCriterion("exchangeid is null");
            return (Criteria) this;
        }

        public Criteria andExchangeidIsNotNull() {
            addCriterion("exchangeid is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeidEqualTo(Integer value) {
            addCriterion("exchangeid =", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotEqualTo(Integer value) {
            addCriterion("exchangeid <>", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidGreaterThan(Integer value) {
            addCriterion("exchangeid >", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeid >=", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLessThan(Integer value) {
            addCriterion("exchangeid <", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeid <=", value, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidIn(List<Integer> values) {
            addCriterion("exchangeid in", values, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotIn(List<Integer> values) {
            addCriterion("exchangeid not in", values, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidBetween(Integer value1, Integer value2) {
            addCriterion("exchangeid between", value1, value2, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExchangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeid not between", value1, value2, "exchangeid");
            return (Criteria) this;
        }

        public Criteria andExtimeIsNull() {
            addCriterion("extime is null");
            return (Criteria) this;
        }

        public Criteria andExtimeIsNotNull() {
            addCriterion("extime is not null");
            return (Criteria) this;
        }

        public Criteria andExtimeEqualTo(Date value) {
            addCriterionForJDBCDate("extime =", value, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("extime <>", value, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("extime >", value, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("extime >=", value, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeLessThan(Date value) {
            addCriterionForJDBCDate("extime <", value, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("extime <=", value, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeIn(List<Date> values) {
            addCriterionForJDBCDate("extime in", values, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("extime not in", values, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("extime between", value1, value2, "extime");
            return (Criteria) this;
        }

        public Criteria andExtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("extime not between", value1, value2, "extime");
            return (Criteria) this;
        }

        public Criteria andExamountIsNull() {
            addCriterion("examount is null");
            return (Criteria) this;
        }

        public Criteria andExamountIsNotNull() {
            addCriterion("examount is not null");
            return (Criteria) this;
        }

        public Criteria andExamountEqualTo(Integer value) {
            addCriterion("examount =", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountNotEqualTo(Integer value) {
            addCriterion("examount <>", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountGreaterThan(Integer value) {
            addCriterion("examount >", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("examount >=", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountLessThan(Integer value) {
            addCriterion("examount <", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountLessThanOrEqualTo(Integer value) {
            addCriterion("examount <=", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountIn(List<Integer> values) {
            addCriterion("examount in", values, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountNotIn(List<Integer> values) {
            addCriterion("examount not in", values, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountBetween(Integer value1, Integer value2) {
            addCriterion("examount between", value1, value2, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountNotBetween(Integer value1, Integer value2) {
            addCriterion("examount not between", value1, value2, "examount");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNull() {
            addCriterion("ticketid is null");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNotNull() {
            addCriterion("ticketid is not null");
            return (Criteria) this;
        }

        public Criteria andTicketidEqualTo(Integer value) {
            addCriterion("ticketid =", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotEqualTo(Integer value) {
            addCriterion("ticketid <>", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThan(Integer value) {
            addCriterion("ticketid >", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketid >=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThan(Integer value) {
            addCriterion("ticketid <", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThanOrEqualTo(Integer value) {
            addCriterion("ticketid <=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidIn(List<Integer> values) {
            addCriterion("ticketid in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotIn(List<Integer> values) {
            addCriterion("ticketid not in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidBetween(Integer value1, Integer value2) {
            addCriterion("ticketid between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketid not between", value1, value2, "ticketid");
            return (Criteria) this;
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