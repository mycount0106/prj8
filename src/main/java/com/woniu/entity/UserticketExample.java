package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserticketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserticketExample() {
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

        public Criteria andUserticketidIsNull() {
            addCriterion("userticketid is null");
            return (Criteria) this;
        }

        public Criteria andUserticketidIsNotNull() {
            addCriterion("userticketid is not null");
            return (Criteria) this;
        }

        public Criteria andUserticketidEqualTo(Integer value) {
            addCriterion("userticketid =", value, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidNotEqualTo(Integer value) {
            addCriterion("userticketid <>", value, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidGreaterThan(Integer value) {
            addCriterion("userticketid >", value, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userticketid >=", value, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidLessThan(Integer value) {
            addCriterion("userticketid <", value, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidLessThanOrEqualTo(Integer value) {
            addCriterion("userticketid <=", value, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidIn(List<Integer> values) {
            addCriterion("userticketid in", values, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidNotIn(List<Integer> values) {
            addCriterion("userticketid not in", values, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidBetween(Integer value1, Integer value2) {
            addCriterion("userticketid between", value1, value2, "userticketid");
            return (Criteria) this;
        }

        public Criteria andUserticketidNotBetween(Integer value1, Integer value2) {
            addCriterion("userticketid not between", value1, value2, "userticketid");
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

        public Criteria andValiddateEqualTo(Date value) {
            addCriterionForJDBCDate("validdate =", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("validdate <>", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThan(Date value) {
            addCriterionForJDBCDate("validdate >", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validdate >=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThan(Date value) {
            addCriterionForJDBCDate("validdate <", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validdate <=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateIn(List<Date> values) {
            addCriterionForJDBCDate("validdate in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("validdate not in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validdate between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validdate not between", value1, value2, "validdate");
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