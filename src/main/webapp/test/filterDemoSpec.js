describe('Testing FilterDemo', function(){
	'use strict';

	beforeEach(module('crashlab'));

	var $filter;

	beforeEach(inject(function(_$filter_){
		$filter= _$filter_;
	}));

	it('testing 1', function(){
		expect($filter('sizeFilter')).not.toBe(null);
	});
})