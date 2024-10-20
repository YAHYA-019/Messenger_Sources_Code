package X;

import com.facebook.graphql.enums.GraphQLStoryCardTypes;
import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Hsp.class */
public final class Hsp {
    public GraphQLStoryCardTypes A00;
    public H9K A01;
    public MontageStickerOverlayBounds A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public Set A09 = AnonymousClass001.A0v();

    public void A00(GraphQLStoryCardTypes graphQLStoryCardTypes) {
        this.A00 = graphQLStoryCardTypes;
        C1pq.A08("storyCardType", graphQLStoryCardTypes);
        if (this.A09.contains("storyCardType")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A09);
        this.A09 = A1E;
        A1E.add("storyCardType");
    }

    public void A01(H9K h9k) {
        this.A01 = h9k;
        C1pq.A08("contentType", h9k);
        if (this.A09.contains("contentType")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A09);
        this.A09 = A1E;
        A1E.add("contentType");
    }
}
