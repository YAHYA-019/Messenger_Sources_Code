package com.facebook.ipc.composer.model;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ComposerShareParamsSerializer.class */
public class ComposerShareParamsSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), ComposerShareParams.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        ComposerShareParams composerShareParams = (ComposerShareParams) obj;
        if (composerShareParams == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A05(r302, c26c, composerShareParams.attachmentPreview, "share_attachment_preview");
        AbstractC11224vw.A05(r302, c26c, composerShareParams.shareable, "shareable");
        AbstractC11224vw.A0D(r302, "link_for_share", composerShareParams.linkForShare);
        AbstractC11224vw.A0D(r302, "accessibility_label", composerShareParams.accessibilityLabel);
        AbstractC11224vw.A0D(r302, "share_tracking", composerShareParams.shareTracking);
        AbstractC11224vw.A0D(r302, "quote_text", composerShareParams.quoteText);
        AbstractC11224vw.A05(r302, c26c, composerShareParams.reshareContext, "reshare_context");
        boolean z = composerShareParams.isReshare;
        r302.A0o("is_reshare");
        r302.A0v(z);
        boolean z2 = composerShareParams.isTicketingShare;
        r302.A0o("is_ticketing_share");
        r302.A0v(z2);
        boolean z3 = composerShareParams.isGifPickerShare;
        r302.A0o("is_gif_picker_share");
        r302.A0v(z3);
        AbstractC11224vw.A0D(r302, "gif_source", composerShareParams.gifSource);
        AbstractC11224vw.A0D(r302, "gif_id", composerShareParams.gifId);
        AbstractC11224vw.A0D(r302, "internal_linkable_id", composerShareParams.internalLinkableId);
        AbstractC11224vw.A0D(r302, "share_scrape_data", composerShareParams.shareScrapeData);
        AbstractC11224vw.A0D(r302, "shared_from_post_id", composerShareParams.sharedFromPostId);
        AbstractC11224vw.A0D(r302, "shared_story_title", composerShareParams.sharedStoryTitle);
        AbstractC11224vw.A05(r302, c26c, composerShareParams.backgroundGradientColor, "background_color_gradient");
        r302.A0Y();
    }
}
