package com.core.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by klash75 on 9/24/2015.
 * <p>
 * Working with java types from javascript
 */
public class Nashorn3 {

    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("load('res/nashorn3.js')");
    }
}
