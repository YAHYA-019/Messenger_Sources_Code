package X;

import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: Fxm.class */
public final class Fxm implements GOd {
    public final int A00;
    public final EkI A01;
    public final ESz A02;

    public Fxm(ESz eSz, EkI ekI, int i) {
        this.A02 = eSz;
        this.A00 = i;
        this.A01 = ekI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.ESz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Fxm(X.GJy r302, java.lang.String r303, java.util.List r304, int r305) {
        /*
            r301 = this;
            X.ESz r0 = new X.ESz
            r306 = r0
            r0 = r306
            r0.<init>()
            X.Emt r0 = new X.Emt
            r307 = r0
            r0 = r307
            r1 = r306
            r2 = 0
            r3 = r303
            r0.<init>(r1, r2, r3)
            r0 = r306
            r1 = r307
            r0.A00 = r1
            r0 = r304
            if (r0 != 0) goto L35
            r0 = r302
            if (r0 != 0) goto L35
            r0 = 0
            r307 = r0
        L2a:
            r0 = r301
            r1 = r306
            r2 = r307
            r3 = r305
            r0.<init>(r1, r2, r3)
            return
        L35:
            X.EkI r0 = new X.EkI
            r307 = r0
            r0 = r307
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fxm.<init>(X.GJy, java.lang.String, java.util.List, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r308 == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Fxm A00(X.GJy r302, java.util.List r303) {
        /*
            r301 = this;
            r0 = r301
            X.EkI r0 = r0.A01
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L57
            r0 = r304
            X.GJy r0 = r0.A00
            r306 = r0
            r0 = r306
            r307 = r0
            r0 = r302
            if (r0 == 0) goto L29
            r0 = r306
            if (r0 == 0) goto L29
            r0 = r306
            r1 = r302
            X.GJy r0 = r0.BcB(r1)
            r306 = r0
        L29:
            r0 = r304
            java.util.List r0 = r0.A01
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L47
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L47
            r0 = r304
            r308 = r0
        L3f:
            r0 = r308
            r1 = r304
            if (r0 != r1) goto L67
        L45:
            r0 = r301
            return r0
        L47:
            X.EkI r0 = new X.EkI
            r308 = r0
            r0 = r308
            r1 = r306
            r2 = r303
            r0.<init>(r1, r2)
            goto L3f
        L57:
            r0 = r303
            if (r0 == 0) goto L45
            X.EkI r0 = new X.EkI
            r308 = r0
            r0 = r308
            r1 = 0
            r2 = r303
            r0.<init>(r1, r2)
        L67:
            r0 = r301
            X.ESz r0 = r0.A02
            r306 = r0
            r0 = r301
            int r0 = r0.A00
            r309 = r0
            X.Fxm r0 = new X.Fxm
            r305 = r0
            r0 = r305
            r1 = r306
            r2 = r308
            r3 = r309
            r0.<init>(r1, r2, r3)
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fxm.A00(X.GJy, java.util.List):X.Fxm");
    }

    @Override // X.GJj
    public /* bridge */ /* synthetic */ GJj AIE(GJy gJy, List list) {
        return A00(gJy, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [X.Emu[]] */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.Emu] */
    /* JADX WARN: Type inference failed for: r0v133, types: [X.Emu] */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.Emu] */
    /* JADX WARN: Type inference failed for: r0v158, types: [X.Emu] */
    /* JADX WARN: Type inference failed for: r0v187, types: [X.Emu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.facebook.minscript.compiler.interfaces.MinsCompilerResult] */
    @Override // X.GOd
    public void AQZ(EWn eWn) {
        ESz eSz = this.A02;
        Emt emt = eSz.A00;
        F9A f9a = emt.A00;
        if (Boolean.valueOf(AnonymousClass001.A1T(f9a)).booleanValue()) {
            return;
        }
        if (f9a == null) {
            String str = emt.A01;
            if (str.startsWith("lispx")) {
                str = str.substring(15);
            }
            ?? r0 = str;
            try {
                r0 = MinsCompilerImpl$Helper.doCompileWithLispyOffsets(r0.getBytes("UTF-8"), false, false);
                r0.byteBuffer.order(ByteOrder.nativeOrder());
                ByteBuffer byteBuffer = r0.byteBuffer;
                HashMap hashMap = r0.lispyOffsetMap;
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                int capacity = byteBuffer.capacity();
                int i = slice.getInt();
                short s = slice.getShort();
                char c = (char) (-1);
                int i2 = s & c;
                int i3 = c & slice.getShort();
                if (i != -1397639502 || i2 != 1 || i3 != 0) {
                    throw new G8L("invalid magic or version");
                }
                int i4 = slice.getInt();
                int i5 = slice.getInt();
                int position = byteBuffer.position();
                if (i4 > capacity) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("buffer is smaller than encoded size ");
                    A0k.append(i4);
                    A0k.append(" ");
                    A0k.append(capacity);
                    A0k.append(" byteBuffer.order:");
                    A0k.append(byteBuffer.order());
                    A0k.append(" native order:");
                    throw new G8L(AnonymousClass001.A0a(ByteOrder.nativeOrder(), A0k));
                }
                if (i4 < position) {
                    throw new G8L("encoded size is too small");
                }
                int i6 = position + (i5 * 16);
                if (i6 > i4) {
                    throw new G8L("encoded size not enough for section headers");
                }
                ?? r02 = new Emu[i5];
                for (int i7 = 0; i7 < i5; i7++) {
                    ?? obj = new Object();
                    obj.A00 = slice.getInt();
                    obj.A02 = slice.getInt();
                    obj.A01 = slice.getInt();
                    slice.getInt();
                    int i8 = obj.A02;
                    if (i8 % 4 != 0) {
                        throw new G8L(String.format("section index %d kind %d invalid alignment", AnonymousClass001.A1b(Integer.valueOf(i7), obj.A00)));
                    }
                    int i9 = obj.A01;
                    if (i6 > i8 || i8 + i9 > i4) {
                        throw new G8L(String.format("section index %d kind %d invalid offset/size", AnonymousClass001.A1b(Integer.valueOf(i7), obj.A00)));
                    }
                    r02[i7] = obj;
                }
                if (i5 < 4) {
                    throw new G8L("less than required number of sections");
                }
                int i10 = 0;
                while (r02[i10].A00 == i10) {
                    i10++;
                    if (i10 >= 4) {
                        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(r02[0].A01 / 16);
                        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(r02[1].A01 / 16);
                        String str2 = "";
                        int i11 = 4;
                        while (true) {
                            int i12 = i11;
                            if (i12 >= i5) {
                                break;
                            }
                            ?? r03 = r02[i12];
                            if (r03.A00 == 4) {
                                ByteBuffer duplicate = slice.duplicate();
                                duplicate.position(r03.A02);
                                duplicate.limit(r03.A02 + r03.A01);
                                byte[] bArr = new byte[duplicate.remaining()];
                                duplicate.get(bArr);
                                str2 = new String(bArr, F9A.A06);
                            }
                            i11 = i12 + 1;
                        }
                        emt = new Emt(emt.A02, new F9A(str2, slice, hashMap, atomicReferenceArray, atomicReferenceArray2, (Emu[]) r02), null);
                    }
                }
                throw new G8L(0Pz.A0T("missing required section ", i10));
            } catch (UnsupportedEncodingException unused) {
                throw AnonymousClass001.A0U(r0);
            }
        }
        eSz.A00 = emt;
    }

    @Override // X.GJj
    public String B9C() {
        F9A f9a = this.A02.A00.A00;
        if (f9a != null) {
            return f9a.A00;
        }
        return null;
    }

    @Override // X.GJj
    public GJy BBh() {
        EkI ekI = this.A01;
        if (ekI == null) {
            return null;
        }
        return ekI.A00;
    }

    @Override // X.GOd
    public Fxl D6L() {
        ESz eSz = this.A02;
        EkI ekI = this.A01;
        F9A f9a = eSz.A00.A00;
        if (f9a != null) {
            return new Fxl(f9a.A00(0), ekI, null, null);
        }
        throw AnonymousClass001.A0N("getMinsClosure() was called while minsClosure is null. This normally happens when getMinsClosure() is called before calling \"ensurePrepared()\" method");
    }
}
