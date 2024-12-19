package com.ql.util.express;

import org.apache.commons.math3.fraction.BigFraction;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FractionTest {

    @Test
    public void fractionTest() throws Exception {
        String exp = "a/b*c";
        ExpressRunner runner = new ExpressRunner(true, false);
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("a", 6500);
        context.put("b", 24);
        context.put("c", 0.75);
        Object result = runner.execute(exp, context, null, false, false);
        System.out.println(result);
    }

}
