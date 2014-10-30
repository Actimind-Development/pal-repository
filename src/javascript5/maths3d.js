
(function(exports, imports) {
    //::imports
  var maths = imports.Maths;
    //::module maths3d
    var maths3d = exports.Maths3d = {
    //::function cylinderVolume
    //@@depends circleArea
    cylinderVolume: function(radius, height) {
        return maths.circleArea(radius) * height;
    },

    //::addbefore
        stub: null
    }
})(window, window);
                    