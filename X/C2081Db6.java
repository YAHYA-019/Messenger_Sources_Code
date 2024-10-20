package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.stickers.model.StickerPack;

/* renamed from: X.Db6, reason: case insensitive filesystem */
/* loaded from: Db6.class */
public final class C2081Db6 extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C2081Db6(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public static void A00(C2081Db6 c2081Db6, String str) {
        c2081Db6.A03(new RuntimeException(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0433, code lost:
    
        if (r306 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2081Db6.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2081Db6.A03(java.lang.Throwable):void");
    }

    public void dispose() {
        Class cls;
        StickerPack stickerPack;
        Object[] objArr;
        String str;
        switch (this.A00) {
            case 15:
                super.dispose();
                CallerContext callerContext = Fao.A0A;
                cls = Fao.class;
                stickerPack = (StickerPack) this.A03;
                objArr = new Object[]{stickerPack.A0B};
                str = "Add sticker pack operation for pack %s cancelled.";
                break;
            case 16:
                super.dispose();
                CallerContext callerContext2 = Fao.A0A;
                cls = Fao.class;
                stickerPack = (StickerPack) this.A03;
                objArr = new Object[]{stickerPack.A0B};
                str = "Image download for pack %s cancelled.";
                break;
            default:
                super.dispose();
                return;
        }
        0fH.A0S(cls, str, objArr);
        Fao.A00((FbUserSession) this.A02, (Fao) this.A01, stickerPack, false);
    }
}
