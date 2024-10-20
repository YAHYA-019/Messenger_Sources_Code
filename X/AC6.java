package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.media.download.params.response.DownloadedMedia;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AC6.class */
public final class AC6 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AC6(NotesCreationFragment notesCreationFragment, String str, List list, int i) {
        this.A00 = i;
        this.A02 = notesCreationFragment;
        this.A01 = list;
        this.A03 = str;
    }

    public AC6(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    private void A00() {
        FriendsTabFragment friendsTabFragment = ((8uK) this.A01).A00;
        Aa0 aa0 = friendsTabFragment.mListener;
        if (aa0 != null) {
            4iI r0 = (4iI) friendsTabFragment.A1A.get();
            UserKey userKey = (UserKey) this.A02;
            11T.A0F(userKey, 0);
            aa0.C9z(4iI.A00(r0, userKey), NavigationTrigger.A06("friends_tab_stories_thread", this.A03));
        }
    }

    private final void A01() {
        8uI r0 = (8uI) this.A02;
        4iI r02 = (4iI) 7zR.A0o(r0.A00, 67720);
        UserKey userKey = (UserKey) this.A01;
        11T.A0F(userKey, 0);
        ThreadKey A00 = 4iI.A00(r02, userKey);
        if (A00 != null) {
            String str = this.A03;
            C3So c3So = r0.A01;
            if (str == null) {
                str = "";
            }
            C3So.A01(c3So, C3So.A00(A00, NavigationTrigger.A06("highlights_tab_stories_thread", str), null, null, null, false));
        }
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                A00();
                return;
            case 1:
                A01();
                return;
            case 2:
                7zQ.A16((Context) this.A02, 2131960004);
                return;
            case 3:
            case 5:
            default:
                return;
            case 4:
                11T.A0F(th, 0);
                0fH.A14("ChatEntityLogger", th.getMessage(), new Object[]{"logChatEntityVideoMessageClick is failed."});
                return;
            case 6:
                NotesCreationFragment notesCreationFragment = (NotesCreationFragment) this.A02;
                ((QuickPerformanceLogger) 1Br.A0B(((5Rf) 1Br.A0B(notesCreationFragment.A0I)).A04)).markerEnd(913375233, (short) 3);
                8LZ r0 = notesCreationFragment.A09;
                if (r0 == null) {
                    11T.A0L("viewDataModel");
                    throw 0Q8.createAndThrow();
                }
                NotesCreationFragment.A06(8LZ.A00(r0.A01, r0.A00, r0.A02, false, r0.A04, r0.A05), notesCreationFragment);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Resources resources;
        int i;
        switch (this.A00) {
            case 0:
                ThreadSummary threadSummary = (ThreadSummary) obj;
                if (threadSummary != null) {
                    ThreadKey threadKey = threadSummary.A0n;
                    Aa0 aa0 = ((8uK) this.A01).A00.mListener;
                    if (aa0 == null) {
                        return;
                    }
                    if (threadKey != null) {
                        aa0.C9z(threadKey, NavigationTrigger.A06("friends_tab_stories_thread", this.A03));
                        return;
                    }
                }
                A00();
                return;
            case 1:
                ThreadSummary threadSummary2 = (ThreadSummary) obj;
                if (threadSummary2 == null) {
                    A01();
                    return;
                }
                C3So c3So = ((8uI) this.A02).A01;
                ThreadKey threadKey2 = threadSummary2.A0n;
                11T.A0A(threadKey2);
                String str = this.A03;
                if (str == null) {
                    str = "";
                }
                C3So.A01(c3So, C3So.A00(threadKey2, NavigationTrigger.A06("highlights_tab_stories_thread", str), null, null, null, false));
                return;
            case 2:
                DownloadedMedia downloadedMedia = (DownloadedMedia) obj;
                String str2 = this.A03;
                if (str2 == null) {
                    int intValue = downloadedMedia.A01.intValue();
                    if (intValue == 0) {
                        resources = ((Context) this.A02).getResources();
                        i = 2131960005;
                    } else if (intValue == 1) {
                        resources = ((Context) this.A02).getResources();
                        i = 2131960003;
                    } else if (intValue != 2) {
                        str2 = "";
                    } else {
                        resources = ((Context) this.A02).getResources();
                        i = 2131960004;
                    }
                    str2 = resources.getString(i);
                }
                7zR.A0z((Context) this.A02, str2);
                return;
            case 3:
                if (obj != null) {
                    Function2 function2 = (Function2) this.A01;
                    RichStatus richStatus = (RichStatus) ((2Tj) 1Br.A0B(((5Q3) this.A02).A0H)).A08.get(this.A03);
                    function2.invoke(obj, Long.valueOf(richStatus != null ? richStatus.A03 : 0L));
                    return;
                }
                return;
            case 4:
                java.util.Map map = (java.util.Map) obj;
                1UG A08 = 1BK.A08(1Br.A02(((6KB) this.A02).A02), "chat_entity_click");
                if (!A08.isSampled() || map == null) {
                    0fH.A0k("ChatEntityLogger", "logChatEntityVideoMessageClick - result is null.");
                    return;
                }
                Object obj2 = map.get("ENTITY_ID");
                if (obj2 == null) {
                    throw 1BK.A0h();
                }
                A08.A7R("entity_id", (String) obj2);
                C97w[] values = C97w.values();
                String A0b = AnonymousClass001.A0b("ENTITY_TYPE", map);
                A08.A5c(values[A0b != null ? Integer.parseInt(A0b) : 0], "entity_type");
                A08.A0C("tap_surface_type");
                7zL.A1F(A08, this.A03);
                Attachment A0T = 4YU.A0T(((Message) this.A01).A0r, 0);
                A08.A6J("extra", ImmutableMap.of((Object) 4YT.A00(ActionId.FORMAT_ERROR), (Object) (A0T != null ? A0T.A0I : null)));
                A08.BZL();
                return;
            case 5:
                if (!(obj instanceof BFh)) {
                    if (obj instanceof BFg) {
                        NotesCreationFragment notesCreationFragment = (NotesCreationFragment) this.A02;
                        ((QuickPerformanceLogger) 1Br.A0B(((5Rf) 1Br.A0B(notesCreationFragment.A0I)).A04)).markerEnd(913375233, (short) 3);
                        7zO.A0c(notesCreationFragment).A03();
                        return;
                    }
                    return;
                }
                NotesCreationFragment notesCreationFragment2 = (NotesCreationFragment) this.A02;
                2aK.A03((Integer) null, (0DE) null, new AJJ((List) this.A01, notesCreationFragment2, this.A03, (0DR) null, 21), 7zN.A0y(), 3);
                5Rf r0 = (5Rf) 1Br.A0B(notesCreationFragment2.A0I);
                r0.A01 = true;
                7zP.A0e(r0.A04).markerPoint(913375233, "creation_task_completed");
                5Rf.A00(r0);
                return;
            case 6:
                if (obj instanceof BFh) {
                    NotesCreationFragment notesCreationFragment3 = (NotesCreationFragment) this.A02;
                    2aK.A03((Integer) null, (0DE) null, new AJJ((List) this.A01, notesCreationFragment3, this.A03, (0DR) null, 21), 7zN.A0y(), 3);
                    5Rf r02 = (5Rf) 1Br.A0B(notesCreationFragment3.A0I);
                    r02.A01 = true;
                    7zP.A0e(r02.A04).markerPoint(913375233, "creation_task_completed");
                    5Rf.A00(r02);
                    NotesCreationFragment.A0A(notesCreationFragment3);
                    return;
                }
                if (obj instanceof BFg) {
                    NotesCreationFragment notesCreationFragment4 = (NotesCreationFragment) this.A02;
                    ((QuickPerformanceLogger) 1Br.A0B(((5Rf) 1Br.A0B(notesCreationFragment4.A0I)).A04)).markerEnd(913375233, (short) 3);
                    7zO.A0c(notesCreationFragment4).A03();
                    8LZ r03 = notesCreationFragment4.A09;
                    if (r03 == null) {
                        11T.A0L("viewDataModel");
                        throw 0Q8.createAndThrow();
                    }
                    NotesCreationFragment.A06(8LZ.A00(r03.A01, r03.A00, r03.A02, false, r03.A04, r03.A05), notesCreationFragment4);
                    return;
                }
                return;
            default:
                9Rn r04 = (9Rn) this.A02;
                String str3 = this.A03;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                GraphQlQueryParamSet A0M = 7zL.A0M();
                4YV.A1A(4YU.A0J(GraphQlCallInput.A02, str3, "prompt_id"), A0M, "data");
                A0M.A04("msgr_channel_prompt_submissions_paginating_first", 14);
                1VX.A04(r04.A00, fbUserSession).A02().A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MessengerBroadcastChannelPromptFetchResponsesQuery", (String) null, "fbandroid", 925031484, 0, 1578899676L, 1578899676L, false, true)));
                return;
        }
    }
}
