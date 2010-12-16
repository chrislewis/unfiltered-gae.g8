package gae

import unfiltered.request._
import unfiltered.response._
  
/** unfiltered plan */
class Plan extends unfiltered.filter.Planify({
  case _ => StringResponse("Hello GAE!")
});
