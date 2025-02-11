public class Television
{
	private String brand;
	private String model;
	private int volume;
	private int channel;
	private int childLockCode;
	private boolean childLockEnabled;
	
	public Television(String brand, String model)
	{
		this.model = model;
		this.brand = brand;
		this.volume = 50;
		this.channel = 1;
		this.childLockEnabled = false;
		this.childLockCode = 1234;
	}
	
	public void setVolume(int volume)
	{
		if (volume >= 0 && volume <= 100)
		{
			this.volume = volume;
		}			
	}
	
	public void increaseVolume()
	{
		if (volume < 100)
		{
			volume++;
		}			
	}
	
	public void decreaseVolume()
	{
		if (volume > 0)
		{
			volume--;
		}			
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setChannel(int channel) 
	{
        if (!childLockEnabled && channel >= 1 && channel <= 75) {
            this.channel = channel;
        }
    }
	
	public void increaseChannel() 
	{
        if (!childLockEnabled && channel < 75) {
            channel++;
        }
    }

    public void decreaseChannel() 
	{
        if (!childLockEnabled && channel > 1) {
            channel--;
        }
    }
	
	 public int getChannel() {
        return channel;
    }

    public void setChildLock(int code) 
	{
        this.childLockCode = code;
        this.childLockEnabled = true;
    }

    public boolean removeChildLock(int code) 
	{
        if (code == this.childLockCode) 
		{
            childLockEnabled = false;
            return true;
        }
        return false;
    }

    public boolean isChildLockEnabled() 
	{
        return childLockEnabled;
    }
	
	public int getChildLockCode() 
	{
    return childLockCode;
	}
}