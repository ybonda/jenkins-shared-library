#!/usr/bin/env groovy

package com.ybonda

class GlobalVars {

    static String foo = "bar"

    // refer to this in a pipeline using:
    //
    // import com.ybonda.GlobalVars
    // println GlobalVars.foo
}