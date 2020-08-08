import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;

public class Connection {
    public String VK_KEY;
    public int GROUP_ID;
    public VkApiClient vk;
    public GroupActor actor;

    public void connection(String VK_KEY, int GROUP_ID) {
        VkApiClient vk = new VkApiClient(HttpTransportClient.getInstance());
        GroupActor actor = new GroupActor(GROUP_ID, VK_KEY);
        this.VK_KEY = VK_KEY;
        this.GROUP_ID = GROUP_ID;
        this.vk = vk;
        this.actor = actor;
    }
}