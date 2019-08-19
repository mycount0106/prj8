package com.woniu.entity;

import java.util.ArrayList;
import java.util.List;

public class RateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RateExample() {
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

        public Criteria andRateidIsNull() {
            addCriterion("rateid is null");
            return (Criteria) this;
        }

        public Criteria andRateidIsNotNull() {
            addCriterion("rateid is not null");
            return (Criteria) this;
        }

        public Criteria andRateidEqualTo(Integer value) {
            addCriterion("rateid =", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidNotEqualTo(Integer value) {
            addCriterion("rateid <>", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidGreaterThan(Integer value) {
            addCriterion("rateid >", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rateid >=", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidLessThan(Integer value) {
            addCriterion("rateid <", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidLessThanOrEqualTo(Integer value) {
            addCriterion("rateid <=", value, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidIn(List<Integer> values) {
            addCriterion("rateid in", values, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidNotIn(List<Integer> values) {
            addCriterion("rateid not in", values, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidBetween(Integer value1, Integer value2) {
            addCriterion("rateid between", value1, value2, "rateid");
            return (Criteria) this;
        }

        public Criteria andRateidNotBetween(Integer value1, Integer value2) {
            addCriterion("rateid not between", value1, value2, "rateid");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Integer value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Integer value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Integer value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Integer value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Integer> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Integer> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDepostitrateIsNull() {
            addCriterion("depostitrate is null");
            return (Criteria) this;
        }

        public Criteria andDepostitrateIsNotNull() {
            addCriterion("depostitrate is not null");
            return (Criteria) this;
        }

        public Criteria andDepostitrateEqualTo(Double value) {
            addCriterion("depostitrate =", value, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateNotEqualTo(Double value) {
            addCriterion("depostitrate <>", value, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateGreaterThan(Double value) {
            addCriterion("depostitrate >", value, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateGreaterThanOrEqualTo(Double value) {
            addCriterion("depostitrate >=", value, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateLessThan(Double value) {
            addCriterion("depostitrate <", value, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateLessThanOrEqualTo(Double value) {
            addCriterion("depostitrate <=", value, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateIn(List<Double> values) {
            addCriterion("depostitrate in", values, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateNotIn(List<Double> values) {
            addCriterion("depostitrate not in", values, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateBetween(Double value1, Double value2) {
            addCriterion("depostitrate between", value1, value2, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andDepostitrateNotBetween(Double value1, Double value2) {
            addCriterion("depostitrate not between", value1, value2, "depostitrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNull() {
            addCriterion("loanrate is null");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNotNull() {
            addCriterion("loanrate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrateEqualTo(Double value) {
            addCriterion("loanrate =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(Double value) {
            addCriterion("loanrate <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(Double value) {
            addCriterion("loanrate >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(Double value) {
            addCriterion("loanrate >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(Double value) {
            addCriterion("loanrate <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(Double value) {
            addCriterion("loanrate <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<Double> values) {
            addCriterion("loanrate in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<Double> values) {
            addCriterion("loanrate not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(Double value1, Double value2) {
            addCriterion("loanrate between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(Double value1, Double value2) {
            addCriterion("loanrate not between", value1, value2, "loanrate");
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