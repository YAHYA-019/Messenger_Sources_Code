package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.composer.quickreply.logging.type.QuickReplyLoggingType;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.stickers.model.StickerPack;
import com.facebook.xapp.messaging.composer.theme.customization.model.ThemeCustomizationPickerParams;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: ABs.class */
public final class ABs implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ABs(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        1FX r304;
        Object obj;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                throw th;
            case 1:
                77I r0 = (77I) this.A02;
                7zP.A0N(r0.A02).Ciz(new ADZ(r0));
                return;
            case 2:
                0fH.A0s(4YT.A00(31), "Unable to fetch thread", th);
                r304 = (1FX) this.A03;
                obj = this.A02;
                r304.set(obj);
                return;
            default:
                r304 = (1FX) this.A02;
                obj = new 9Pv(1BK.A0b(), (String) null);
                r304.set(obj);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        1FX r305;
        Object obj2;
        FetchThreadResult fetchThreadResult;
        MessagesCollection messagesCollection;
        List<03Y> list;
        switch (this.A00) {
            case 0:
                8Lq r0 = (8Lq) obj;
                String A0s = 7zR.A0s();
                if (r0 == null || (list = (List) r0.A01) == null) {
                    return;
                }
                Message message = (Message) this.A01;
                1Br r02 = (1Br) this.A02;
                ArrayList A0z = 1BL.A0z(list);
                for (03Y r03 : list) {
                    C9a9 c9a9 = new C9a9();
                    c9a9.A0C = (String) r03.first;
                    c9a9.A07 = (Double) r03.second;
                    c9a9.A03 = 8AJ.A02;
                    c9a9.A02 = 8AN.A0A;
                    c9a9.A04 = message.A0V;
                    c9a9.A01 = QuickReplyLoggingType.A07;
                    c9a9.A09 = A0s;
                    c9a9.A0D = ((7NU) 1Br.A0B(r02)).A03;
                    A0z.add(new QuickReplyItem(c9a9));
                }
                6Rz r04 = 6Rz.A02;
                7zL.A1T(this.A03, new 6Rz(message.A0V, ImmutableList.copyOf((Collection) A0z)));
                return;
            case 1:
                8Lu r05 = (8Lu) obj;
                06Z r06 = (06Z) this.A01;
                if (r06.A1U() || r06.A0B) {
                    return;
                }
                if (r05 == null) {
                    77I r07 = (77I) this.A02;
                    7zP.A0N(r07.A02).Ciz(new ADZ(r07));
                    return;
                }
                ImmutableList.of();
                ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) r05.A00;
                C1pq.A08("currentTheme", threadThemeInfo);
                ImmutableList immutableList = (ImmutableList) r05.A01;
                C1pq.A08("themeOptions", immutableList);
                9Ck.A00(new ThemeCustomizationPickerParams((ThreadKey) this.A03, threadThemeInfo, immutableList), (String) null, ((77I) this.A02).A06, false, false).A0m(r06, "CustomizeThemePlugin");
                return;
            case 2:
                OperationResult operationResult = (OperationResult) obj;
                if (operationResult.success && (fetchThreadResult = (FetchThreadResult) operationResult.A08()) != null && (messagesCollection = fetchThreadResult.A03) != null) {
                    1Du it = messagesCollection.A01.iterator();
                    while (it.hasNext()) {
                        Message message2 = (Message) it.next();
                        Message message3 = (Message) this.A02;
                        if (TextUtils.equals(message3.A1V, message2.A1V)) {
                            String A00 = 4YT.A00(31);
                            ImmutableList immutableList2 = message2.A0r;
                            0fH.A0h(1BK.A0k(immutableList2), A00, "fetched the message from DB/Cache, attachments: %d");
                            1FX r08 = (1FX) this.A03;
                            if (immutableList2.isEmpty()) {
                                message2 = message3;
                            }
                            r08.set(message2);
                            return;
                        }
                    }
                }
                r305 = (1FX) this.A03;
                obj2 = this.A02;
                break;
            default:
                List list2 = (List) obj;
                if (list2 != null && !list2.isEmpty()) {
                    StickerPack stickerPack = (StickerPack) 0QD.A0D(list2);
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable(4YT.A00(1091), stickerPack);
                    79Z r09 = (79Z) this.A03;
                    1Kd.A0F(AC8.A00(this.A01, 64), r09.A01.AUS(A05), r09.A03);
                    return;
                }
                r305 = (1FX) this.A01;
                obj2 = ImmutableList.of();
                break;
        }
        r305.set(obj2);
    }
}
