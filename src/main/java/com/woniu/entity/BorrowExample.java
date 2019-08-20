package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andMoneyonmonthIsNull() {
            addCriterion("moneyOnmonth is null");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthIsNotNull() {
            addCriterion("moneyOnmonth is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthEqualTo(Double value) {
            addCriterion("moneyOnmonth =", value, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthNotEqualTo(Double value) {
            addCriterion("moneyOnmonth <>", value, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthGreaterThan(Double value) {
            addCriterion("moneyOnmonth >", value, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthGreaterThanOrEqualTo(Double value) {
            addCriterion("moneyOnmonth >=", value, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthLessThan(Double value) {
            addCriterion("moneyOnmonth <", value, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthLessThanOrEqualTo(Double value) {
            addCriterion("moneyOnmonth <=", value, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthIn(List<Double> values) {
            addCriterion("moneyOnmonth in", values, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthNotIn(List<Double> values) {
            addCriterion("moneyOnmonth not in", values, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthBetween(Double value1, Double value2) {
            addCriterion("moneyOnmonth between", value1, value2, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andMoneyonmonthNotBetween(Double value1, Double value2) {
            addCriterion("moneyOnmonth not between", value1, value2, "moneyonmonth");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeIsNull() {
            addCriterion("borrowidime is null");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeIsNotNull() {
            addCriterion("borrowidime is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeEqualTo(Date value) {
            addCriterionForJDBCDate("borrowidime =", value, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrowidime <>", value, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeGreaterThan(Date value) {
            addCriterionForJDBCDate("borrowidime >", value, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowidime >=", value, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeLessThan(Date value) {
            addCriterionForJDBCDate("borrowidime <", value, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowidime <=", value, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeIn(List<Date> values) {
            addCriterionForJDBCDate("borrowidime in", values, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrowidime not in", values, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowidime between", value1, value2, "borrowidime");
            return (Criteria) this;
        }

        public Criteria andBorrowidimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowidime not between", value1, value2, "borrowidime");
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

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Double value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Double value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Double value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Double value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Double> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Double> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyIsNull() {
            addCriterion("residuemoney is null");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyIsNotNull() {
            addCriterion("residuemoney is not null");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyEqualTo(Double value) {
            addCriterion("residuemoney =", value, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyNotEqualTo(Double value) {
            addCriterion("residuemoney <>", value, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyGreaterThan(Double value) {
            addCriterion("residuemoney >", value, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("residuemoney >=", value, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyLessThan(Double value) {
            addCriterion("residuemoney <", value, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyLessThanOrEqualTo(Double value) {
            addCriterion("residuemoney <=", value, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyIn(List<Double> values) {
            addCriterion("residuemoney in", values, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyNotIn(List<Double> values) {
            addCriterion("residuemoney not in", values, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyBetween(Double value1, Double value2) {
            addCriterion("residuemoney between", value1, value2, "residuemoney");
            return (Criteria) this;
        }

        public Criteria andResiduemoneyNotBetween(Double value1, Double value2) {
            addCriterion("residuemoney not between", value1, value2, "residuemoney");
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