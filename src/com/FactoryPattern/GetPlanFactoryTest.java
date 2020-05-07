package com.FactoryPattern;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class GetPlanFactoryTest {
    GetPlanFactory getPlanFactory ;

    @Before
    public void initializeFactory() {
        getPlanFactory = new GetPlanFactory();
    }

    @Test
    public void shouldReturnTheCorrectObject() {
            assertTrue( getPlanFactory.getPlan("COMMERCIALPLAN") instanceof CommercialPlan);
            assertTrue( getPlanFactory.getPlan("INSTITUTIONALPLAN") instanceof InstitutionalPlan);
            assertTrue( getPlanFactory.getPlan("DOMESTICPLAN") instanceof DomesticPlan);
            assertNull( getPlanFactory.getPlan("Nothing"));
    }
}