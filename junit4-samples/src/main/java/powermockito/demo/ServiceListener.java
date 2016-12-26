package powermockito.demo;

public interface ServiceListener
{
    void onSuccess(Service service);

    void onFailure(Service service);
}
