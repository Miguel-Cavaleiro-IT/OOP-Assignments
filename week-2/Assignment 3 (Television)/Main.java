public class Main{
	public static void main(String[] args)
	{
		Television t = new Television("Samsung", "QLED");
		
		t.setVolume(80);
        System.out.println("Current Volume: " + t.getVolume());

        t.increaseVolume();
        System.out.println("Increased Volume: " + t.getVolume());

        t.setChannel(5);
        System.out.println("Current Channel: " + t.getChannel());
		
		t.increaseChannel();
		System.out.println("Increased Channel: " + t.getChannel());

		System.out.println("Is child lock enabled: " + t.isChildLockEnabled());

        t.setChildLock(1234);
        System.out.println("Child Lock Enabled: " + t.isChildLockEnabled() + ". Code: " + t.getChildLockCode());

        t.removeChildLock(1234);
        System.out.println("Child Lock Enabled: " + t.isChildLockEnabled());
		
	}
}