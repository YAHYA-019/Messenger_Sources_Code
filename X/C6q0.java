package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.stickers.model.StickerPack;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.6q0, reason: invalid class name */
/* loaded from: 6q0.class */
public final class C6q0 {
    public 1BY A00;
    public final C6pt A03 = (C6pt) 1Bn.A0E((Context) null, (1BY) null, 50160);
    public final 5R0 A01 = (5R0) 1Bi.A03(82988);
    public final C6q1 A02 = (C6q1) 1Bi.A03(50168);

    public C6q0(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public void A00(FbUserSession fbUserSession, 1TC r303) {
        boolean A1T;
        ImmutableList immutableList;
        StickerPack stickerPack = (StickerPack) r303.A00.getParcelable("stickerPack");
        5R0 r0 = this.A01;
        ContentValues A07 = 4YU.A07();
        String str = stickerPack.A0B;
        A07.put("pack_id", str);
        SQLiteDatabase AUF = r0.A01.AUF();
        C01m.A01(AUF, 1916136803);
        try {
            C01m.A00(-722596585);
            AUF.insertWithOnConflict("closed_download_preview_sticker_packs", null, A07, 4);
            C01m.A00(605879535);
            AUF.setTransactionSuccessful();
            C01m.A03(AUF, -821485597);
            Object A04 = 1Lo.A04((Context) null, fbUserSession, this.A00, 49969);
            69H r02 = (69H) A04;
            synchronized (A04) {
                A1T = AnonymousClass001.A1T(r02.A02);
            }
            if (A1T) {
                synchronized (A04) {
                    immutableList = r02.A02;
                }
                ArrayList A00 = 1JW.A00(Math.max(0, immutableList.size() - 1));
                1Du it = immutableList.iterator();
                while (it.hasNext()) {
                    StickerPack stickerPack2 = (StickerPack) it.next();
                    if (!stickerPack2.A0B.equals(str)) {
                        A00.add(stickerPack2);
                    }
                }
                synchronized (A04) {
                    r02.A02 = ImmutableList.copyOf((Collection) A00);
                }
            }
        } catch (Throwable th) {
            C01m.A03(AUF, 1072533483);
            throw th;
        }
    }
}
