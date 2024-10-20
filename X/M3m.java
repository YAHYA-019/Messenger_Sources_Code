package X;

import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: M3m.class */
public final class M3m extends C00q implements Function1 {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3m(String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FJC A0f;
        String str;
        int i;
        java.util.Map map;
        boolean z;
        Boolean valueOf;
        Object obj2;
        File file;
        MEV mev;
        L29 l29;
        ExZ A03;
        switch (this.A00) {
            case 0:
                mev = (MEV) obj;
                mev.ClM(KdW.A02, 11T.A03(this.A01));
                l29 = KdW.A0K;
                A03 = new ExZ(5);
                mev.ClM(l29, A03);
                file = 04S.A00;
                return file;
            case 1:
                mev = (MEV) obj;
                String str2 = this.A01;
                l29 = KdW.A02;
                A03 = 11T.A03(str2);
                mev.ClM(l29, A03);
                file = 04S.A00;
                return file;
            case 2:
                return JR0.A0l(obj, this.A01);
            case 3:
                03Y r0 = (03Y) obj;
                11T.A0F(r0, 0);
                obj = r0.first;
                return JR0.A0l(obj, this.A01);
            case 4:
                file = (File) obj;
                11T.A0F(file, 0);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    return AnonymousClass001.A0D(parentFile, this.A01);
                }
                return file;
            case 5:
                C1ru c1ru = (C1ru) obj;
                11T.A0F(c1ru, 0);
                return c1ru.Ako(this.A01);
            case 6:
                map = (java.util.Map) obj;
                z = false;
                11T.A0F(map, 0);
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
                valueOf = Boolean.valueOf(z);
                obj2 = "wasInterrupted";
                map.put(obj2, valueOf);
                map.put(1BJ.A00(2069), Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                file = 04S.A00;
                return file;
            case 7:
                map = (java.util.Map) obj;
                11T.A0F(map, 0);
                map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
                z = true;
                valueOf = Boolean.valueOf(z);
                obj2 = "wasInterrupted";
                map.put(obj2, valueOf);
                map.put(1BJ.A00(2069), Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                file = 04S.A00;
                return file;
            case 8:
            case 9:
            case 10:
            default:
                map = (java.util.Map) obj;
                11T.A0F(map, 0);
                valueOf = this.A01;
                obj2 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
                map.put(obj2, valueOf);
                map.put(1BJ.A00(2069), Integer.valueOf(Process.getThreadPriority(Process.myTid())));
                file = 04S.A00;
                return file;
            case 11:
            case 12:
                ((Number) obj).intValue();
                return this.A01;
            case 13:
                GOo.A0g(obj).Bij(this.A01);
                file = 04S.A00;
                return file;
            case 14:
                GOo.A0g(obj).Bk3(this.A01);
                file = 04S.A00;
                return file;
            case 15:
                GOo.A0g(obj).CBz(this.A01);
                file = 04S.A00;
                return file;
            case 16:
                GOo.A0g(obj).CO5(this.A01);
                file = 04S.A00;
                return file;
            case 17:
                GOo.A0g(obj).CP9(this.A01);
                file = 04S.A00;
                return file;
            case 18:
                return this.A01;
            case 19:
                String str3 = this.A01;
                if (str3 != null && str3.length() != 0) {
                    7zP.A0e(7Jz.A0Y).markerPoint(5512460, str3.hashCode(), "Overlay_Image_Invisible");
                }
                file = 04S.A00;
                return file;
            case 20:
                Ktj ktj = (Ktj) obj;
                11T.A0F(ktj, 0);
                obj = ktj.A01;
                return JR0.A0l(obj, this.A01);
            case 21:
                Kte kte = (Kte) obj;
                11T.A0F(kte, 0);
                obj = kte.A02;
                return JR0.A0l(obj, this.A01);
            case 22:
                A0f = DKD.A0f(obj);
                str = this.A01;
                i = 33;
                return FJC.A02(A0f, new AV7(str, A0f, i).invoke(A0f.A01));
            case 23:
                A0f = DKD.A0f(obj);
                str = this.A01;
                i = 34;
                return FJC.A02(A0f, new AV7(str, A0f, i).invoke(A0f.A01));
            case 24:
                MEV mev2 = (MEV) obj;
                11T.A0F(mev2, 0);
                mev2.ClM(KdW.A02, 11T.A03(this.A01));
                mev2.ClM(KdW.A0K, new ExZ(5));
                file = 04S.A00;
                return file;
        }
    }
}
