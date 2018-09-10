package com.ssm.test.model;

import java.util.ArrayList;
import java.util.List;

public class MusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicExample() {
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

        public Criteria andMusicnameIsNull() {
            addCriterion("musicName is null");
            return (Criteria) this;
        }

        public Criteria andMusicnameIsNotNull() {
            addCriterion("musicName is not null");
            return (Criteria) this;
        }

        public Criteria andMusicnameEqualTo(String value) {
            addCriterion("musicName =", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotEqualTo(String value) {
            addCriterion("musicName <>", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameGreaterThan(String value) {
            addCriterion("musicName >", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameGreaterThanOrEqualTo(String value) {
            addCriterion("musicName >=", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLessThan(String value) {
            addCriterion("musicName <", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLessThanOrEqualTo(String value) {
            addCriterion("musicName <=", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLike(String value) {
            addCriterion("musicName like", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotLike(String value) {
            addCriterion("musicName not like", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameIn(List<String> values) {
            addCriterion("musicName in", values, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotIn(List<String> values) {
            addCriterion("musicName not in", values, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameBetween(String value1, String value2) {
            addCriterion("musicName between", value1, value2, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotBetween(String value1, String value2) {
            addCriterion("musicName not between", value1, value2, "musicname");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNull() {
            addCriterion("coverUrl is null");
            return (Criteria) this;
        }

        public Criteria andCoverurlIsNotNull() {
            addCriterion("coverUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCoverurlEqualTo(String value) {
            addCriterion("coverUrl =", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotEqualTo(String value) {
            addCriterion("coverUrl <>", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThan(String value) {
            addCriterion("coverUrl >", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlGreaterThanOrEqualTo(String value) {
            addCriterion("coverUrl >=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThan(String value) {
            addCriterion("coverUrl <", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLessThanOrEqualTo(String value) {
            addCriterion("coverUrl <=", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlLike(String value) {
            addCriterion("coverUrl like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotLike(String value) {
            addCriterion("coverUrl not like", value, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlIn(List<String> values) {
            addCriterion("coverUrl in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotIn(List<String> values) {
            addCriterion("coverUrl not in", values, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlBetween(String value1, String value2) {
            addCriterion("coverUrl between", value1, value2, "coverurl");
            return (Criteria) this;
        }

        public Criteria andCoverurlNotBetween(String value1, String value2) {
            addCriterion("coverUrl not between", value1, value2, "coverurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlIsNull() {
            addCriterion("resourceUrl is null");
            return (Criteria) this;
        }

        public Criteria andResourceurlIsNotNull() {
            addCriterion("resourceUrl is not null");
            return (Criteria) this;
        }

        public Criteria andResourceurlEqualTo(String value) {
            addCriterion("resourceUrl =", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotEqualTo(String value) {
            addCriterion("resourceUrl <>", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlGreaterThan(String value) {
            addCriterion("resourceUrl >", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlGreaterThanOrEqualTo(String value) {
            addCriterion("resourceUrl >=", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLessThan(String value) {
            addCriterion("resourceUrl <", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLessThanOrEqualTo(String value) {
            addCriterion("resourceUrl <=", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLike(String value) {
            addCriterion("resourceUrl like", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotLike(String value) {
            addCriterion("resourceUrl not like", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlIn(List<String> values) {
            addCriterion("resourceUrl in", values, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotIn(List<String> values) {
            addCriterion("resourceUrl not in", values, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlBetween(String value1, String value2) {
            addCriterion("resourceUrl between", value1, value2, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotBetween(String value1, String value2) {
            addCriterion("resourceUrl not between", value1, value2, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNull() {
            addCriterion("classify is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNotNull() {
            addCriterion("classify is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyEqualTo(Integer value) {
            addCriterion("classify =", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotEqualTo(Integer value) {
            addCriterion("classify <>", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThan(Integer value) {
            addCriterion("classify >", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("classify >=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThan(Integer value) {
            addCriterion("classify <", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThanOrEqualTo(Integer value) {
            addCriterion("classify <=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyIn(List<Integer> values) {
            addCriterion("classify in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotIn(List<Integer> values) {
            addCriterion("classify not in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyBetween(Integer value1, Integer value2) {
            addCriterion("classify between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotBetween(Integer value1, Integer value2) {
            addCriterion("classify not between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andHeatIsNull() {
            addCriterion("heat is null");
            return (Criteria) this;
        }

        public Criteria andHeatIsNotNull() {
            addCriterion("heat is not null");
            return (Criteria) this;
        }

        public Criteria andHeatEqualTo(Integer value) {
            addCriterion("heat =", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotEqualTo(Integer value) {
            addCriterion("heat <>", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThan(Integer value) {
            addCriterion("heat >", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("heat >=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThan(Integer value) {
            addCriterion("heat <", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThanOrEqualTo(Integer value) {
            addCriterion("heat <=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatIn(List<Integer> values) {
            addCriterion("heat in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotIn(List<Integer> values) {
            addCriterion("heat not in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatBetween(Integer value1, Integer value2) {
            addCriterion("heat between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotBetween(Integer value1, Integer value2) {
            addCriterion("heat not between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andClickupnumIsNull() {
            addCriterion("clickupnum is null");
            return (Criteria) this;
        }

        public Criteria andClickupnumIsNotNull() {
            addCriterion("clickupnum is not null");
            return (Criteria) this;
        }

        public Criteria andClickupnumEqualTo(Integer value) {
            addCriterion("clickupnum =", value, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumNotEqualTo(Integer value) {
            addCriterion("clickupnum <>", value, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumGreaterThan(Integer value) {
            addCriterion("clickupnum >", value, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickupnum >=", value, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumLessThan(Integer value) {
            addCriterion("clickupnum <", value, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumLessThanOrEqualTo(Integer value) {
            addCriterion("clickupnum <=", value, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumIn(List<Integer> values) {
            addCriterion("clickupnum in", values, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumNotIn(List<Integer> values) {
            addCriterion("clickupnum not in", values, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumBetween(Integer value1, Integer value2) {
            addCriterion("clickupnum between", value1, value2, "clickupnum");
            return (Criteria) this;
        }

        public Criteria andClickupnumNotBetween(Integer value1, Integer value2) {
            addCriterion("clickupnum not between", value1, value2, "clickupnum");
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