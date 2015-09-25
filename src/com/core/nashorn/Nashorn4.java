package com.core.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by klash75 on 9/24/2015.
 */
public class Nashorn4 {

    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("loadWithNewGlobal('res/nashorn4.js')");
    }

}
