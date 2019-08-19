package com.woniu.entity;

import java.util.ArrayList;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicketnameIsNull() {
            addCriterion("ticketname is null");
            return (Criteria) this;
        }

        public Criteria andTicketnameIsNotNull() {
            addCriterion("ticketname is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnameEqualTo(String value) {
            addCriterion("ticketname =", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotEqualTo(String value) {
            addCriterion("ticketname <>", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameGreaterThan(String value) {
            addCriterion("ticketname >", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameGreaterThanOrEqualTo(String value) {
            addCriterion("ticketname >=", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameLessThan(String value) {
            addCriterion("ticketname <", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameLessThanOrEqualTo(String value) {
            addCriterion("ticketname <=", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameLike(String value) {
            addCriterion("ticketname like", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotLike(String value) {
            addCriterion("ticketname not like", value, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameIn(List<String> values) {
            addCriterion("ticketname in", values, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotIn(List<String> values) {
            addCriterion("ticketname not in", values, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameBetween(String value1, String value2) {
            addCriterion("ticketname between", value1, value2, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketnameNotBetween(String value1, String value2) {
            addCriterion("ticketname not between", value1, value2, "ticketname");
            return (Criteria) this;
        }

        public Criteria andTicketrateIsNull() {
            addCriterion("ticketrate is null");
            return (Criteria) this;
        }

        public Criteria andTicketrateIsNotNull() {
            addCriterion("ticketrate is not null");
            return (Criteria) this;
        }

        public Criteria andTicketrateEqualTo(Double value) {
            addCriterion("ticketrate =", value, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateNotEqualTo(Double value) {
            addCriterion("ticketrate <>", value, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateGreaterThan(Double value) {
            addCriterion("ticketrate >", value, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateGreaterThanOrEqualTo(Double value) {
            addCriterion("ticketrate >=", value, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateLessThan(Double value) {
            addCriterion("ticketrate <", value, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateLessThanOrEqualTo(Double value) {
            addCriterion("ticketrate <=", value, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateIn(List<Double> values) {
            addCriterion("ticketrate in", values, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateNotIn(List<Double> values) {
            addCriterion("ticketrate not in", values, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateBetween(Double value1, Double value2) {
            addCriterion("ticketrate between", value1, value2, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andTicketrateNotBetween(Double value1, Double value2) {
            addCriterion("ticketrate not between", value1, value2, "ticketrate");
            return (Criteria) this;
        }

        public Criteria andValiddateIsNull() {
            addCriterion("validdate is null");
            return (Criteria) this;
        }

        public Criteria andValiddateIsNotNull() {
            addCriterion("validdate is not null");
            return (Criteria) this;
        }

        public Criteria andValiddateEqualTo(Integer value) {
            addCriterion("validdate =", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotEqualTo(Integer value) {
            addCriterion("validdate <>", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThan(Integer value) {
            addCriterion("validdate >", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThanOrEqualTo(Integer value) {
            addCriterion("validdate >=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThan(Integer value) {
            addCriterion("validdate <", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThanOrEqualTo(Integer value) {
            addCriterion("validdate <=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateIn(List<Integer> values) {
            addCriterion("validdate in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotIn(List<Integer> values) {
            addCriterion("validdate not in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateBetween(Integer value1, Integer value2) {
            addCriterion("validdate between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotBetween(Integer value1, Integer value2) {
            addCriterion("validdate not between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andNeedcreditIsNull() {
            addCriterion("needcredit is null");
            return (Criteria) this;
        }

        public Criteria andNeedcreditIsNotNull() {
            addCriterion("needcredit is not null");
            return (Criteria) this;
        }

        public Criteria andNeedcreditEqualTo(Integer value) {
            addCriterion("needcredit =", value, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditNotEqualTo(Integer value) {
            addCriterion("needcredit <>", value, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditGreaterThan(Integer value) {
            addCriterion("needcredit >", value, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("needcredit >=", value, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditLessThan(Integer value) {
            addCriterion("needcredit <", value, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditLessThanOrEqualTo(Integer value) {
            addCriterion("needcredit <=", value, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditIn(List<Integer> values) {
            addCriterion("needcredit in", values, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditNotIn(List<Integer> values) {
            addCriterion("needcredit not in", values, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditBetween(Integer value1, Integer value2) {
            addCriterion("needcredit between", value1, value2, "needcredit");
            return (Criteria) this;
        }

        public Criteria andNeedcreditNotBetween(Integer value1, Integer value2) {
            addCriterion("needcredit not between", value1, value2, "needcredit");
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