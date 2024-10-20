package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: AJi.class */
public final class AJi extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJi(0DR r302, Function2 function2) {
        super(2, r302);
        this.A03 = 4;
        this.A01 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJi(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJi(Object obj, Object obj2, 0DR r304, int i) {
        super(2, r304);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static Context A01(AJi aJi) {
        return ((Fragment) aJi.A02).requireContext();
    }

    public static Integer A02(Bitmap bitmap, Rect rect) {
        HsW hsW = new HsW(bitmap);
        hsW.A00 = 3;
        hsW.A05.clear();
        hsW.A01(rect.left, rect.top, rect.right, rect.bottom);
        I5J i5j = hsW.A00().A01;
        if (i5j != null) {
            return Integer.valueOf(i5j.A05);
        }
        return null;
    }

    public static AJi A03(Object obj, Object obj2, 0DR r303, int i) {
        return new AJi(obj, obj2, r303, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        Object obj5;
        Object obj6;
        int i3;
        switch (this.A03) {
            case 0:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 0;
                return A03(obj6, obj5, r303, i3);
            case 1:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 1;
                return A03(obj2, obj3, r303, i);
            case 2:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 2;
                return A03(obj2, obj3, r303, i);
            case 3:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 3;
                return A03(obj6, obj5, r303, i3);
            case 4:
                AJi aJi = new AJi(r303, (Function2) this.A01);
                aJi.A02 = obj;
                return aJi;
            case 5:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 5;
                return A03(obj6, obj5, r303, i3);
            case 6:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 6;
                return A03(obj6, obj5, r303, i3);
            case 7:
                obj4 = this.A02;
                i2 = 7;
                AJi aJi2 = new AJi(obj4, r303, i2);
                aJi2.A01 = obj;
                return aJi2;
            case 8:
                obj4 = this.A02;
                i2 = 8;
                AJi aJi22 = new AJi(obj4, r303, i2);
                aJi22.A01 = obj;
                return aJi22;
            case 9:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 9;
                return A03(obj6, obj5, r303, i3);
            case 10:
                obj4 = this.A02;
                i2 = 10;
                AJi aJi222 = new AJi(obj4, r303, i2);
                aJi222.A01 = obj;
                return aJi222;
            case 11:
                obj4 = this.A02;
                i2 = 11;
                AJi aJi2222 = new AJi(obj4, r303, i2);
                aJi2222.A01 = obj;
                return aJi2222;
            case 12:
                obj4 = this.A02;
                i2 = 12;
                AJi aJi22222 = new AJi(obj4, r303, i2);
                aJi22222.A01 = obj;
                return aJi22222;
            case 13:
                obj4 = this.A02;
                i2 = 13;
                AJi aJi222222 = new AJi(obj4, r303, i2);
                aJi222222.A01 = obj;
                return aJi222222;
            case 14:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 14;
                return A03(obj6, obj5, r303, i3);
            case 15:
                obj4 = this.A02;
                i2 = 15;
                AJi aJi2222222 = new AJi(obj4, r303, i2);
                aJi2222222.A01 = obj;
                return aJi2222222;
            case 16:
                obj4 = this.A02;
                i2 = 16;
                AJi aJi22222222 = new AJi(obj4, r303, i2);
                aJi22222222.A01 = obj;
                return aJi22222222;
            case 17:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 17;
                return A03(obj6, obj5, r303, i3);
            case 18:
                obj4 = this.A02;
                i2 = 18;
                AJi aJi222222222 = new AJi(obj4, r303, i2);
                aJi222222222.A01 = obj;
                return aJi222222222;
            case 19:
                obj4 = this.A02;
                i2 = 19;
                AJi aJi2222222222 = new AJi(obj4, r303, i2);
                aJi2222222222.A01 = obj;
                return aJi2222222222;
            case 20:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 20;
                return A03(obj6, obj5, r303, i3);
            case 21:
                obj4 = this.A02;
                i2 = 21;
                AJi aJi22222222222 = new AJi(obj4, r303, i2);
                aJi22222222222.A01 = obj;
                return aJi22222222222;
            case 22:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 22;
                return A03(obj6, obj5, r303, i3);
            case 23:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 23;
                return A03(obj6, obj5, r303, i3);
            case 24:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 24;
                return A03(obj2, obj3, r303, i);
            case 25:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 25;
                return A03(obj6, obj5, r303, i3);
            case 26:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 26;
                return A03(obj6, obj5, r303, i3);
            case 27:
                obj4 = this.A02;
                i2 = 27;
                AJi aJi222222222222 = new AJi(obj4, r303, i2);
                aJi222222222222.A01 = obj;
                return aJi222222222222;
            case 28:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 28;
                return A03(obj6, obj5, r303, i3);
            case 29:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 29;
                return A03(obj6, obj5, r303, i3);
            case 30:
                obj4 = this.A02;
                i2 = 30;
                AJi aJi2222222222222 = new AJi(obj4, r303, i2);
                aJi2222222222222.A01 = obj;
                return aJi2222222222222;
            case 31:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 31;
                return A03(obj2, obj3, r303, i);
            case 32:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 32;
                return A03(obj6, obj5, r303, i3);
            case 33:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 33;
                return A03(obj2, obj3, r303, i);
            case 34:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 34;
                return A03(obj2, obj3, r303, i);
            case 35:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 35;
                return A03(obj6, obj5, r303, i3);
            case 36:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 36;
                return A03(obj2, obj3, r303, i);
            case 37:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 37;
                return A03(obj6, obj5, r303, i3);
            case 38:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 38;
                return A03(obj6, obj5, r303, i3);
            case 39:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 39;
                return A03(obj6, obj5, r303, i3);
            case 40:
                obj4 = this.A02;
                i2 = 40;
                AJi aJi22222222222222 = new AJi(obj4, r303, i2);
                aJi22222222222222.A01 = obj;
                return aJi22222222222222;
            case 41:
                obj4 = this.A02;
                i2 = 41;
                AJi aJi222222222222222 = new AJi(obj4, r303, i2);
                aJi222222222222222.A01 = obj;
                return aJi222222222222222;
            case 42:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 42;
                return A03(obj2, obj3, r303, i);
            case 43:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 43;
                return A03(obj2, obj3, r303, i);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 44;
                return A03(obj6, obj5, r303, i3);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 45;
                return A03(obj6, obj5, r303, i3);
            case 46:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 46;
                return A03(obj2, obj3, r303, i);
            case ActionId.ON_START_END /* 47 */:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 47;
                return A03(obj6, obj5, r303, i3);
            case ActionId.QUEUED /* 48 */:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 48;
                return A03(obj2, obj3, r303, i);
            default:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 49;
                return A03(obj6, obj5, r303, i3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x05ff, code lost:
    
        if (r0.A00 != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x069b, code lost:
    
        if (r0.A00 != 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0837, code lost:
    
        if (r0.A1l() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x1a08, code lost:
    
        if (r0 != null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x1a0b, code lost:
    
        r0 = r0.getValue();
        r0 = X.04R.A06((java.util.Map) r0);
        r0.put(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x1a38, code lost:
    
        if (r0.AGt(r0, r0) == false) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x1a3e, code lost:
    
        r0 = r0.getValue();
        r0 = X.04R.A06((java.util.Map) r0);
        r0.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x1a69, code lost:
    
        if (r0.AGt(r0, r0) == false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x2488, code lost:
    
        if (r303 != r306) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x1d0c, code lost:
    
        if (r0.A0G != false) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x1fe0, code lost:
    
        if (r0.A0C != false) goto L660;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:742:0x2166. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x1c06  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x2283  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x22e7  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x230c  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x2369  */
    /* JADX WARN: Type inference failed for: r0v1035, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1086, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1125, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1259, types: [com.facebook.messaging.encryptedbackups.restoreflow.fragment.HighFrictionRestoreIntroFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v1500, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1579, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v166, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1661, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.base.fragment.AbstractNavigableFragment, com.facebook.messaging.encryptedbackups.passkey.ui.setup.EbPasskeySetupFragment] */
    /* JADX WARN: Type inference failed for: r0v1759, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.base.fragment.AbstractNavigableFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbNuxPasskeyRestoreFragment] */
    /* JADX WARN: Type inference failed for: r0v1784, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbNuxPasskeyRestoreFragment] */
    /* JADX WARN: Type inference failed for: r0v1832, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1852, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1868, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1990, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v202, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2028, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2077, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2093, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2125, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2160, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2214, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v225, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v242, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v589, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v616, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v630, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v817, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v854, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v917, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v968, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v131 */
    /* JADX WARN: Type inference failed for: r304v132 */
    /* JADX WARN: Type inference failed for: r304v134 */
    /* JADX WARN: Type inference failed for: r304v32 */
    /* JADX WARN: Type inference failed for: r304v53 */
    /* JADX WARN: Type inference failed for: r304v57 */
    /* JADX WARN: Type inference failed for: r304v63, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 9489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
