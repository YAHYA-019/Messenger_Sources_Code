package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.facebook.base.fragment.NavigableFragment;
import com.facebook.bugreporter.activity.BugReportActivity;
import com.facebook.bugreporter.activity.bugreport.BugReportFragment;
import com.facebook.bugreporter.activity.categorylist.CategoryInfo;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: Faq.class */
public final class Faq implements GHX {
    public final /* synthetic */ BugReportActivity A00;

    public Faq(BugReportActivity bugReportActivity) {
        this.A00 = bugReportActivity;
    }

    public void Byj(Intent intent, NavigableFragment navigableFragment) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        BugReportActivity bugReportActivity = this.A00;
        DKD.A1E((1Mg) bugReportActivity.A06.get(), "com.facebook.bugreporter.BUG_REPORT_FLOW_FINISHED_ACTION");
        if (intent == null) {
            BugReportActivity.A15(bugReportActivity, false);
            return;
        }
        if (intent.hasExtra("isSendClickedFlag")) {
            BugReportActivity.A15(bugReportActivity, intent.getBooleanExtra("isSendClickedFlag", false));
            return;
        }
        if (intent.hasExtra("user_description")) {
            bugReportActivity.A02.A0V = intent.getStringExtra("user_description");
        }
        if (intent.hasExtra("to_be_doodle_image_attachment")) {
            bugReportActivity.A03 = (BugReportAttachment) intent.getParcelableExtra("to_be_doodle_image_attachment");
            num2 = 0S2.A01;
        } else {
            if (!intent.hasExtra("doodled_image_uri")) {
                str = "100977986739334";
                if (intent.hasExtra("privacy_decision")) {
                    bugReportActivity.A02.A0K = Boolean.valueOf(intent.getBooleanExtra("privacy_decision", false));
                    if (bugReportActivity.A01.A00.size() <= 1) {
                        String valueOf = String.valueOf(((CategoryInfo) bugReportActivity.A01.A00.get(0)).A00);
                        ExV exV = bugReportActivity.A02;
                        exV.A0P = valueOf;
                        exV.A0S = bugReportActivity.A01.A02;
                    } else if (!BugReportActivity.A16(bugReportActivity, bugReportActivity.A02.A0B)) {
                        num = 0S2.A0Y;
                        BugReportActivity.A1D(bugReportActivity, num, false, true, false);
                        return;
                    } else {
                        ExV exV2 = bugReportActivity.A02;
                        exV2.A0S = bugReportActivity.A01.A02;
                        exV2.A0P = str;
                    }
                } else {
                    if (!intent.hasExtra("issue_category")) {
                        if (!(navigableFragment instanceof BugReportFragment)) {
                            boolean booleanExtra = intent.getBooleanExtra("retry", false);
                            if (!booleanExtra) {
                                String stringExtra = intent.getStringExtra("category_id");
                                bugReportActivity.A02.A0P = stringExtra != null ? stringExtra : "100977986739334";
                                HashMap A0u = AnonymousClass001.A0u();
                                str2 = "true";
                                A0u.put("bug_reporter_suggested_product_did_show", intent.getBooleanExtra("suggested_pabu_shown", false) ? str2 : "false");
                                A0u.put("bug_reporter_suggested_product_used", intent.getBooleanExtra("suggested_pabu_used", false) ? str2 : "false");
                                A0u.put("bug_reporter_product_area_search_used", intent.getBooleanExtra("suggested_pabu_search_used", false) ? "true" : "false");
                                bugReportActivity.A02.A01(A0u);
                            }
                            BugReportActivity.A1D(bugReportActivity, 1BK.A0N(bugReportActivity.A07).AZk(36314455294615505L) ? 0S2.A0N : 0S2.A00, booleanExtra, true, false);
                            return;
                        }
                        String stringExtra2 = intent.getStringExtra("bug_desc");
                        if (!Platform.stringIsNullOrEmpty(stringExtra2)) {
                            bugReportActivity.A02.A0V = stringExtra2;
                        }
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("bug_shots");
                        if (parcelableArrayListExtra != null) {
                            bugReportActivity.A02.A0t = 1BK.A17(ImmutableList.copyOf((Collection) parcelableArrayListExtra));
                        }
                        AttachmentCounter attachmentCounter = (AttachmentCounter) intent.getParcelableExtra("bug_screenshots_added_counter");
                        if (attachmentCounter != null) {
                            bugReportActivity.A02.A0F = attachmentCounter;
                        }
                        AttachmentCounter attachmentCounter2 = (AttachmentCounter) intent.getParcelableExtra("bug_screenshots_removed_counter");
                        if (attachmentCounter2 != null) {
                            bugReportActivity.A02.A0G = attachmentCounter2;
                            return;
                        }
                        return;
                    }
                    bugReportActivity.A02.A0h = intent.getStringExtra("issue_category");
                }
                num = 0S2.A00;
                BugReportActivity.A1D(bugReportActivity, num, false, true, false);
                return;
            }
            Uri uri = (Uri) intent.getParcelableExtra("doodled_image_uri");
            ExV exV3 = bugReportActivity.A02;
            if (exV3 != null && uri != null && uri != Uri.EMPTY && bugReportActivity.A03 != null) {
                if (DKH.A0f(exV3.A0t).contains(bugReportActivity.A03)) {
                    ExV exV4 = bugReportActivity.A02;
                    BugReportAttachment bugReportAttachment = bugReportActivity.A03;
                    List list = exV4.A0t;
                    bugReportActivity.A00 = list == null ? -1 : list.indexOf(bugReportAttachment);
                    BugReportAttachmentMediaType bugReportAttachmentMediaType = BugReportAttachmentMediaType.A04;
                    BugReportAttachmentMediaSource bugReportAttachmentMediaSource = BugReportAttachmentMediaSource.A03;
                    Parcelable.Creator creator = BugReportAttachment.CREATOR;
                    BugReportAttachment A00 = BugReportAttachment.Companion.A00(uri, bugReportAttachmentMediaSource, bugReportAttachmentMediaType, "BugReporterFb4aDoodleImageFragment");
                    if (A00 != null) {
                        ExV exV5 = bugReportActivity.A02;
                        BugReportAttachment bugReportAttachment2 = bugReportActivity.A03;
                        DKG.A1U(exV5.A0G, bugReportAttachment2.A00);
                        DKG.A1U(exV5.A0F, A00.A00);
                        if (exV5.A0t != null) {
                            int i = 0;
                            while (true) {
                                if (i >= exV5.A0t.size()) {
                                    break;
                                }
                                if (exV5.A0t.get(i).equals(bugReportAttachment2)) {
                                    if (i == 0) {
                                        java.util.Map map = exV5.A0v;
                                        if (map instanceof ImmutableMap) {
                                            exV5.A01(map);
                                        }
                                        exV5.A0v.put("original_screenshot_removed_or_replaced", "true");
                                    }
                                    exV5.A0t.set(i, A00);
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                bugReportActivity.A03 = null;
            }
            num2 = 0S2.A00;
        }
        BugReportActivity.A1D(bugReportActivity, num2, false, true, true);
    }

    public boolean CFu(NavigableFragment navigableFragment) {
        this.A00.onBackPressed();
        return true;
    }
}
