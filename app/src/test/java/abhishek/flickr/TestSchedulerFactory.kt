package abhishek.flickr

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import abhishek.flickr.core.SchedulerFactory

class TestSchedulerFactory : SchedulerFactory {
  override val mainScheduler: Scheduler
    get() = Schedulers.trampoline()

  override val ioScheduler: Scheduler
    get() = Schedulers.trampoline()
}
