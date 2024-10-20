package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.extensions.common.ExtensionParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.plugins.core.adminmessagecta.AdminMessageCTAHandler;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.messaging.sharedalbum.plugins.renameadmincta.SharedAlbumRenameAdminCta;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: N6r.class */
public final class N6r implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public N6r(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C2cw A01;
        String str;
        1xH r305;
        C19d c19d;
        1xF r3052;
        Integer num;
        boolean z;
        switch (this.A00) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    1xF r0 = (1xF) this.A02;
                    1xF.A02(r0).A0C(false);
                    A01 = 1xF.A01(r0);
                    str = "DISABLE_MEDIA_EXPIRATION_SUCCESSFUL";
                    A01.A05(str);
                    r305 = (1xH) this.A01;
                    c19d = 0EI.A00;
                    r305.A04(c19d);
                    return;
                }
                r305 = (1xH) this.A01;
                c19d = new C19d(null);
                r305.A04(c19d);
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    1xF r02 = (1xF) this.A02;
                    1xF.A02(r02).A0B(false);
                    A01 = 1xF.A01(r02);
                    str = "TRIGGER_EXPIRATION_DISABLE_SUCCESSFUL";
                    A01.A05(str);
                    r305 = (1xH) this.A01;
                    c19d = 0EI.A00;
                    r305.A04(c19d);
                    return;
                }
                r305 = (1xH) this.A01;
                c19d = new C19d(null);
                r305.A04(c19d);
                return;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                r3052 = (1xF) this.A02;
                if (booleanValue) {
                    num = (Integer) this.A01;
                    z = true;
                    1xF.A03(r3052, num, z);
                    1xF.A01(r3052).A05("TRIGGER_EXPIRATION_ENABLE_SUCCESSFUL");
                    1xF.A01(r3052).A01();
                    return;
                }
                1xF.A01(r3052).A04("TRIGGER_EXPIRATION_ENABLE_QUERY_THREW_FAIL");
                return;
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                r3052 = (1xF) this.A02;
                if (booleanValue2) {
                    num = (Integer) this.A01;
                    z = false;
                    1xF.A03(r3052, num, z);
                    1xF.A01(r3052).A05("TRIGGER_EXPIRATION_ENABLE_SUCCESSFUL");
                    1xF.A01(r3052).A01();
                    return;
                }
                1xF.A01(r3052).A04("TRIGGER_EXPIRATION_ENABLE_QUERY_THREW_FAIL");
                return;
            case 4:
                1qX r03 = (1qX) obj;
                String valueOf = String.valueOf(r03.mResultSet.getNullableLong(0, 11));
                C7sh c7sh = (C7sh) this.A01;
                AdminMessageCTAHandler adminMessageCTAHandler = (AdminMessageCTAHandler) this.A02;
                ThreadKey threadKey = adminMessageCTAHandler.A04;
                BOT bot = adminMessageCTAHandler.A01;
                ExtensionParams A00 = COS.A00(bot, threadKey, valueOf, r03.mResultSet.getString(0, 12));
                String A002 = 4YT.A00(ActionId.MQTT_CONNECTING);
                Bundle bundle = c7sh.A00;
                bundle.putParcelable(A002, A00);
                adminMessageCTAHandler.A06.CVn((ExtensionParams) bundle.getParcelable(A002));
                ((IEZ) 1Bu.A06(adminMessageCTAHandler.A00, 83032)).A08(bot, threadKey, valueOf);
                return;
            default:
                1qX r04 = (1qX) obj;
                Long nullableLong = r04.mResultSet.getNullableLong(0, 11);
                if (nullableLong != null) {
                    long longValue = nullableLong.longValue();
                    String string = r04.mResultSet.getString(0, 12);
                    SharedAlbumRenameAdminCta sharedAlbumRenameAdminCta = (SharedAlbumRenameAdminCta) this.A02;
                    ThreadKey threadKey2 = sharedAlbumRenameAdminCta.A05;
                    SharedAlbumArgs sharedAlbumArgs = new SharedAlbumArgs(threadKey2, 0S2.A01, string, longValue);
                    ((9nJ) 1Br.A0B(sharedAlbumRenameAdminCta.A02)).A09(threadKey2, longValue);
                    View view = (View) this.A01;
                    C9c5 c9c5 = new C9c5(view, sharedAlbumArgs);
                    String str2 = sharedAlbumArgs.A03;
                    if (str2 != null) {
                        4YV.A11(sharedAlbumRenameAdminCta.A03).execute(new N8y(view, sharedAlbumRenameAdminCta, c9c5, str2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
