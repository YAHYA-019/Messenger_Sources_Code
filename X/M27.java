package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: M27.class */
public final class M27 extends C00q implements C00m {
    public static final M27 A00 = new M27();

    public M27() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0c = 1BK.A0c();
        C01i c01i = LDO.A0C;
        return AbG.A10(A0c, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, JQz.A0w("[fF]ull.?[nN]ame|[fF]irst.*[lL]ast.*[nN]ame|\\b[nN]ame|\\b[nN]ome|^[nN]ombre[s]$|[aA]pellidos y [nN]ombres|[nN]ombres y [aA]pellidos", JR0.A10(A0c, "family-name", JQz.A0w("[fF]amily.?[nN]ame|^[lL]ast.?[nN]ame|\\blname|[sS]urname|^[aA]pellido[s]$\"", JR0.A10(A0c, "given-name", JQz.A0w("[gG]iven.?[nN]ame|[fF]irst.?[nN]ame|\\bfname", JR0.A10(A0c, "address-level1", JQz.A0w("[rR]egion|[pP]rovince|[sS]tate|[eE]stado", JR0.A10(A0c, "address-level2", JQz.A0w("[cC]ity|[tT]own|[cC]idade", JR0.A10(A0c, "postal-code", JQz.A0w("[zZ][iI][pP]|[pP]ostal|[pP]ost.*[cC]ode", JR0.A10(A0c, "country", JQz.A0w("[cC]ountry", JR0.A10(A0c, "address-line1", JQz.A0w("address.*line|address[^\\[]?1|addr[^\\[]?1|[sS]treet|address.*one", JR0.A10(A0c, "address-line2", JQz.A0w("address.*line[^\\[]?2|address[^\\[]?2|addr[^\\[]?2|[sS]uite|[aA]partment|address.*two", JR0.A10(A0c, "address-line3", JQz.A0w("address.*line[^\\[]?3|address[^\\[]?3|addr[^\\[]?3|line[^\\[]?3|address.*three", JR0.A10(A0c, "tel", JQz.A0w("[pP]hone|[\b_][tT]el|[tT]el(f|eph)", JR0.A10(A0c, "email", JQz.A0w("[eE][- ]?mail|[uU]ser[\\-_\\s]?[nN]ame", (Set) c01i.getValue()), c01i)), c01i)), c01i)), c01i)), c01i)), c01i)), c01i)), c01i)), c01i)), c01i)), c01i)));
    }
}
