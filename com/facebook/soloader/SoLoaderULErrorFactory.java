package com.facebook.soloader;

import X.0Pz;
import X.C0l8;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: SoLoaderULErrorFactory.class */
public class SoLoaderULErrorFactory {
    public static boolean corruptedLibName(String str) {
        Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        Log.w("SoLoader", 0Pz.A0W("Library name is corrupted, contains non-ASCII characters ", matcher.group()));
        return true;
    }

    public static SoLoaderULError create(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        SoLoaderULError soLoaderULError;
        if (unsatisfiedLinkError.getMessage() != null && unsatisfiedLinkError.getMessage().contains("ELF")) {
            C0l8.A00("SoLoader", "Corrupted lib file detected");
            soLoaderULError = new SoLoaderULError(str, unsatisfiedLinkError.toString());
        } else if (corruptedLibName(str)) {
            C0l8.A00("SoLoader", "Corrupted lib name detected");
            soLoaderULError = new SoLoaderULError(str, 0Pz.A0V("corrupted lib name: ", unsatisfiedLinkError));
        } else {
            soLoaderULError = new SoLoaderULError(str, unsatisfiedLinkError.toString());
        }
        soLoaderULError.initCause(unsatisfiedLinkError);
        return soLoaderULError;
    }
}
