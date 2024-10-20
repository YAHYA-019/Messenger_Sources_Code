package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.reactions.gen.EmojiModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsModel;
import com.facebook.rsys.reactions.gen.EmojiReactionsParticipantModel;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: I8n.class */
public final class I8n {
    public JKF A00;
    public EmojiReactionsModel A01;
    public String A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2JM A07;
    public final C00m A08;

    public I8n(FbUserSession fbUserSession, Context context) {
        1BL.A1F(fbUserSession, context);
        this.A04 = 1Lm.A00(context, fbUserSession, 115029);
        this.A05 = GOn.A0U(context, fbUserSession);
        this.A06 = 7zM.A0Q();
        this.A03 = 7zM.A0d();
        this.A07 = IY8.A01(this, 24);
        this.A08 = new J9s(this, 29);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EmojiReactionsParticipantModel A00(EmojiReactionsModel emojiReactionsModel, String str) {
        EmojiReactionsParticipantModel emojiReactionsParticipantModel = null;
        ArrayList arrayList = emojiReactionsModel.emojiParticipants;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (11T.A0O(str, ((EmojiReactionsParticipantModel) next).participantId)) {
                    emojiReactionsParticipantModel = next;
                    break;
                }
            }
            emojiReactionsParticipantModel = emojiReactionsParticipantModel;
        }
        return emojiReactionsParticipantModel;
    }

    public static final void A01(I8n i8n, EmojiReactionsParticipantModel emojiReactionsParticipantModel) {
        if (((HqV) 1Br.A0B(i8n.A04)).A00(GOq.A0p(i8n.A05))) {
            long A00 = (emojiReactionsParticipantModel.emojiExpiryTime * 1000) - 1Br.A00(i8n.A03);
            if (A00 >= 0) {
                JKF jkf = i8n.A00;
                if (jkf != null) {
                    EmojiModel emojiModel = emojiReactionsParticipantModel.emoji;
                    int i = emojiModel.type;
                    String str = emojiModel.emojiId;
                    if (i == 3) {
                        try {
                            Uri A03 = C0A2.A03(str);
                            if (A03 != null) {
                                jkf.ANu(A03);
                            }
                        } catch (SecurityException unused) {
                        }
                        throw 1BK.A0h();
                    }
                    11T.A09(str);
                    jkf.ANv(str);
                }
                1GU A0N = 7zP.A0N(i8n.A06);
                final C00m c00m = i8n.A08;
                A0N.CY4(new Runnable(c00m) { // from class: X.Ird
                    public static final String __redex_internal_original_name = "ParticipantEmojiReactionStateController$sam$java_lang_Runnable$0";
                    public final /* synthetic */ C00m A00;

                    {
                        11T.A0F(c00m, 1);
                        this.A00 = c00m;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.A00.invoke();
                    }
                }, A00);
            }
        }
    }

    public final void A02() {
        JKF jkf = this.A00;
        if (jkf != null) {
            jkf.BNt();
        }
        this.A02 = null;
        this.A00 = null;
        GOp.A0O(this.A05).A02(this.A07);
    }

    public final void A03(JKF jkf, String str) {
        EmojiReactionsParticipantModel A00;
        11T.A0H(str, jkf);
        if (this.A00 == null) {
            GOq.A1H(this.A07, GOp.A0O(this.A05), HAp.A0G);
        }
        this.A00 = jkf;
        this.A02 = str;
        EmojiReactionsModel emojiReactionsModel = (EmojiReactionsModel) GOo.A0p(EmojiReactionsModel.CONVERTER, GOq.A0p(this.A05));
        this.A01 = emojiReactionsModel;
        if (emojiReactionsModel == null || (A00 = A00(emojiReactionsModel, str)) == null) {
            return;
        }
        A01(this, A00);
    }
}
