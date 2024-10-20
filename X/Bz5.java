package X;

import android.content.Context;
import com.facebook.messaging.aibot.plugins.core.threadsettings.aistudio.clickhandler.ThreadSettingsAiStudioClickHandler;
import com.facebook.messaging.groups.plugins.core.threadsettingsclickhandler.showgroupmembers.ThreadSettingsSeeGroupMembersGroupClickHandler;
import com.facebook.messaging.groups.plugins.leavegroup.threadsettingsclick.ThreadSettingsLeaveGroupClickHandler;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.advancedcrypto.plugins.threadsettingsclickhandler.groupkeys.ThreadSettingsGroupKeysClickHandler;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsclickhandler.ThreadSettingsFeedbackAndReportingClickHandler;
import com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsclickhandler.blockgroupmember.ThreadSettingsBlockGroupMemberClickHandler;
import com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsclickhandler.blockuser.ThreadSettingsBlockUserClickHandler;

/* loaded from: Bz5.class */
public final class Bz5 {
    public ThreadSettingsAiStudioClickHandler A00;
    public ThreadSettingsSeeGroupMembersGroupClickHandler A01;
    public ThreadSettingsLeaveGroupClickHandler A02;
    public ThreadSettingsGroupKeysClickHandler A03;
    public ThreadSettingsFeedbackAndReportingClickHandler A04;
    public ThreadSettingsBlockGroupMemberClickHandler A05;
    public ThreadSettingsBlockUserClickHandler A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public final Context A0E;
    public final 06Z A0F;
    public final ThreadKey A0G;
    public final 1YC A0H = 1YC.A03;
    public final DHc A0I;
    public final DHd A0J;
    public final DHb A0K;

    public Bz5(Context context, 06Z r303, ThreadKey threadKey, DHb dHb, DHc dHc, DHd dHd) {
        this.A0E = context;
        this.A0G = threadKey;
        this.A0F = r303;
        this.A0I = dHc;
        this.A0K = dHb;
        this.A0J = dHd;
    }
}
