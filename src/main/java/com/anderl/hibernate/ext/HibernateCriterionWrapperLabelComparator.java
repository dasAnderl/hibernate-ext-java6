package com.anderl.hibernate.ext;

import java.util.Comparator;
import java.util.Locale;

/**
 * Created by ga2sunk on 3/28/14.
 */
public class HibernateCriterionWrapperLabelComparator implements Comparator<HibernateCriterionWrapper> {

    public HibernateCriterionWrapperLabelComparator(Locale locale, String resourceBundleName) {
        this.locale = locale;
        this.resourceBundleName = resourceBundleName;
    }

    private Locale locale;
    private String resourceBundleName;

    @Override
    public int compare(HibernateCriterionWrapper first, HibernateCriterionWrapper second) {
        // TODO implement me
       return 1;
    }

}
