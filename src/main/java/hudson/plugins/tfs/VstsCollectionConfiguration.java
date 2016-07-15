package hudson.plugins.tfs;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.util.ListBoxModel;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

public class VstsCollectionConfiguration extends AbstractDescribableImpl<VstsCollectionConfiguration> {

    private final String collectionUrl;
    private final String credentialsId;

    @DataBoundConstructor
    public VstsCollectionConfiguration(final String collectionUrl, final String credentialsId) {
        this.collectionUrl = collectionUrl;
        this.credentialsId = credentialsId;
    }

    public String getCollectionUrl() {
        return collectionUrl;
    }

    public String getCredentialsId() {
        return credentialsId;
    }

    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) super.getDescriptor();
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<VstsCollectionConfiguration> {

        @Override
        public String getDisplayName() {
            return "Team Project Collection";
        }

        @SuppressWarnings("unused")
        public ListBoxModel doFillCredentialsIdItems(
            @QueryParameter final String collectionUrl) {

            // TODO: populate listbox with credentials
            return new ListBoxModel();
        }
    }
}
