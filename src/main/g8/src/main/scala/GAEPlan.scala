package $package$

import unfiltered.request._
import unfiltered.response._
  
/** unfiltered plan */
class $plan$ extends unfiltered.filter.Planify({
  case _ => ResponseString("Hello GAE!")
});
