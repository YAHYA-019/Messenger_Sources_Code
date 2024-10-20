package com.facebook.minscript.compiler.interfaces;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: MinsCompilerResult.class */
public class MinsCompilerResult {
    public ByteBuffer byteBuffer;
    public HashMap lispyOffsetMap;

    public MinsCompilerResult(ByteBuffer byteBuffer, HashMap hashMap) {
        this.byteBuffer = byteBuffer;
        this.lispyOffsetMap = hashMap;
    }
}
