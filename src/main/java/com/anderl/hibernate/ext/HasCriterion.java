package com.anderl.hibernate.ext;

import java.util.List;

/**
 * Created by ga2unte on 8.9.2014.
 */
public interface HasCriterion<T> {

    default List<HibernateCriterionWrapper> getCriterions() {
        return Helper.invokeGettersByReturnType(HibernateCriterionWrapper.class, this);
    }
}
