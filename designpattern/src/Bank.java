public interface Bank //Subject
{
    public void registerMedia(Media observer); //media will subscribe or register to get updates
    public void removeMedia(Media observer); //media can be removed
    public void notifyMedias(); //notifications to media
}
