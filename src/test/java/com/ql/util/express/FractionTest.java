package com.ql.util.express;

import org.junit.Test;

public class FractionTest {

    @Test
    public void fractionTest() throws Exception {
        String exp = "a/b*c";
        ExpressRunner runner = new ExpressRunner(true, false, true);
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("a", 6500);
        context.put("b", 24);
        context.put("c", 0.75);
        // 2.12499999999975 -》 2.12
        // 2.125 -》 2.13
        Object result = runner.execute(exp, context, null, false, false);
        System.out.println(result);

        context.put("a", 1);
        context.put("b", 3);
        context.put("c", 3);
        // 2.12499999999975 -》 2.12
        // 2.125 -》 2.13
        result = runner.execute(exp, context, null, false, false);
        System.out.println(result);
    }

}
