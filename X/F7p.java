package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: F7p.class */
public final class F7p {
    public final ImmutableMap A02;
    public final 1Br A01 = 1Bq.A00(98413);
    public final 1Br A00 = AbG.A0M();

    public F7p() {
        Set A06 = 1Bi.A06(ActionId.WAIT_FOR_BLOCKERS);
        11T.A0A(A06);
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            A0c.putAll(((GG5) it.next()).AnM());
        }
        ImmutableMap build = A0c.build();
        11T.A0A(build);
        this.A02 = build;
    }

    public static final Class A00(QuickPromotionDefinition quickPromotionDefinition, F7p f7p) {
        if (quickPromotionDefinition.A05()) {
            return E7r.class;
        }
        if (quickPromotionDefinition.A01() != null) {
            C00i c00i = ((Efg) 1Br.A0B(f7p.A01)).A00.A00;
            if (1BK.A0M(c00i).AZk(36310551168680296L) || 1BK.A0M(c00i).AZk(2342153560382308711L)) {
                return E7r.class;
            }
        }
        QuickPromotionDefinition.TemplateType templateType = quickPromotionDefinition.template;
        if (templateType != QuickPromotionDefinition.TemplateType.A0x) {
            return (Class) f7p.A02.get(templateType);
        }
        return null;
    }

    public final DZF A01(Intent intent) {
        C01s A04;
        StringBuilder A0n;
        String str;
        QuickPromotionDefinition quickPromotionDefinition = (QuickPromotionDefinition) intent.getParcelableExtra("qp_definition");
        if (quickPromotionDefinition == null) {
            1Br.A04(this.A00).D0v(0Pz.A0W("QuickPromotionFragmentFactory", "_get_qp_from_intent"), "No qp_definition in intent");
            return null;
        }
        Class A00 = A00(quickPromotionDefinition, this);
        if (A00 == null) {
            return null;
        }
        try {
            DZF dzf = (DZF) A00.newInstance();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.setClassLoader(A00.getClassLoader());
            }
            dzf.setArguments(extras);
            return dzf;
        } catch (IllegalAccessException e) {
            e = e;
            A04 = 1Br.A04(this.A00);
            A0n = AnonymousClass001.A0n("QuickPromotionFragmentFactory");
            str = "_access";
            A04.softReport(AnonymousClass001.A0d(str, A0n), "Unable to create QP fragment", e);
            return null;
        } catch (InstantiationException e2) {
            e = e2;
            A04 = 1Br.A04(this.A00);
            A0n = AnonymousClass001.A0n("QuickPromotionFragmentFactory");
            str = "_instantiation";
            A04.softReport(AnonymousClass001.A0d(str, A0n), "Unable to create QP fragment", e);
            return null;
        }
    }
}
