package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.collect.ImmutableList;

/* loaded from: F58.class */
public final class F58 {
    public 1BY A00;
    public final C15h A01 = G7K.A01(this, ActionId.ABORTED);

    public F58(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static ImmutableList A00(ImmutableList immutableList) {
        Tree tree;
        TreeBuilderJNI treeBuilderJNI;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            TreeJNI treeJNI = (TreeJNI) it.next();
            Object obj = 2JZ.A01;
            if (treeJNI != null) {
                if (treeJNI.isValidGraphServicesJNIModel()) {
                    tree = treeJNI.reinterpret(DkZ.class, -563803127);
                } else if ((treeJNI instanceof Tree) && treeJNI.isValidGraphServicesJNIModel() && (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("PeerToPeerPaymentRequest", 6As.class, -563803127, treeJNI)) != null) {
                    tree = treeBuilderJNI.getResult(DkZ.class, -563803127);
                }
                builder.m11011add((Object) tree);
            }
            tree = null;
            builder.m11011add((Object) tree);
        }
        return builder.build();
    }
}
