package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.communitymessaging.CommunityMessagingThreadSummary;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;

/* loaded from: Cxh.class */
public final class Cxh implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Cxh(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.BwC, java.lang.Object] */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        CGW cgw;
        String str;
        switch (this.A00) {
            case 0:
                CFU cfu = (CFU) this.A01;
                C00i c00i = cfu.A02.A00;
                ((CGW) c00i.get()).A00("thread_type_mutation_get_channel");
                Object obj2 = ((MailboxNullable) obj).value;
                11T.A0I(obj2, "null cannot be cast to non-null type com.facebook.messengercommunitycqljava.GetCommunityJoinedChannel");
                1qX r0 = (1qX) obj2;
                if (1qX.A00(r0) > 0 && 7zP.A03(r0, 0) > 0) {
                    C1x1 A0O = 7zP.A0O(cfu.A04);
                    MutableLiveData mutableLiveData = cfu.A00;
                    ?? obj3 = new Object();
                    ((BwC) obj3).A05 = true;
                    ((BwC) obj3).A04 = false;
                    ((BwC) obj3).A03 = this.A02;
                    AbH.A1N(mutableLiveData, A0O, (BwC) obj3);
                    CFU.A00(cfu);
                    cgw = (CGW) c00i.get();
                    str = "thread_type_mutation_success";
                    break;
                } else {
                    cgw = (CGW) c00i.get();
                    str = "thread_type_mutation_fail";
                    break;
                }
                break;
            case 1:
                CFU cfu2 = (CFU) this.A01;
                C00i c00i2 = cfu2.A02.A00;
                ((CGW) c00i2.get()).A00("join_listener_load_community");
                Object obj4 = ((MailboxNullable) obj).value;
                11T.A0I(obj4, "null cannot be cast to non-null type com.facebook.messengercommunitycqljava.GetCommunityFolder");
                1qX r02 = (1qX) obj4;
                if (1qX.A00(r02) == 0) {
                    cgw = (CGW) c00i2.get();
                    str = "join_listener_empty_community";
                    break;
                } else {
                    Integer nullableInteger = r02.mResultSet.getNullableInteger(0, 18);
                    if (nullableInteger != null || !AbK.A0o(cfu2.A03).AZk(36321855522685800L)) {
                        Long nullableLong = r02.mResultSet.getNullableLong(0, 7);
                        Long nullableLong2 = r02.mResultSet.getNullableLong(0, 8);
                        if (nullableLong == null) {
                            String str2 = this.A02;
                            long parseLong = Long.parseLong(str2);
                            if (nullableLong2 == null || parseLong != nullableLong2.longValue()) {
                                ((CGW) c00i2.get()).A00("join_listener_success");
                                7zP.A0O(cfu2.A04).A00(cfu2.A00, new CommunityMessagingThreadSummary(null, nullableInteger, null, "server_join_error", null, str2, false, false));
                                CFU.A00(cfu2);
                                return;
                            }
                        }
                        cgw = (CGW) c00i2.get();
                        str = "join_listener_fail";
                        break;
                    } else {
                        return;
                    }
                }
            case 2:
                Byr byr = (Byr) this.A01;
                byr.A09.A03("report_completed");
                FeedbackReportFragment feedbackReportFragment = byr.A02;
                if (feedbackReportFragment != null) {
                    feedbackReportFragment.A1F();
                }
                6Io r03 = byr.A06;
                FbUserSession fbUserSession = byr.A05;
                ThreadKey threadKey = byr.A03;
                String str3 = this.A02;
                FRXParams fRXParams = byr.A01;
                r03.A0C(fbUserSession, fRXParams.A00, threadKey, fRXParams.A09, str3, (String) null);
                return;
            default:
                if (AnonymousClass001.A1V(obj)) {
                    ((C21N) ((Cbd) ((Iar) this.A01).A01).A0G.get()).A00(new Iad(this, 1));
                    return;
                } else {
                    0fH.A0k(Cbd.__redex_internal_original_name, "Failed to issue GIF search query network request");
                    return;
                }
        }
        cgw.A00(str);
    }
}
