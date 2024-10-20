package com.facebook.minscript.compiler;

import X.C0il;
import com.facebook.minscript.compiler.interfaces.MinsCompilerResult;
import java.nio.ByteBuffer;

/* loaded from: MinsCompilerImpl$Helper.class */
public class MinsCompilerImpl$Helper {
    static {
        C0il.A0B("minscompiler-jni");
    }

    public static native ByteBuffer doCompile(byte[] bArr, boolean z);

    public static native MinsCompilerResult doCompileWithLispyOffsets(byte[] bArr, boolean z, boolean z2);
}
