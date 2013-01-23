
{
  'includes': [
    '../skia/gyp/common.gypi',
  ],
  'targets': [
    {
      'target_name': 'expat',
      'type': 'static_library',
      'mac_bundle' : 1,
      'include_dirs' : [
        '.'
      ],
      'conditions': [
        [ 'skia_os == "linux"', {
          'cflags': [
            '-fPIC', '-Wall'
          ],
          'sources': [
          ],
	  'defines': [
	    'HAVE_EXPAT_CONFIG_H'
	  ]
        }],
        [ 'skia_os == "win"', {
          'cflags': [
          ],
          'sources': [
          ],
	  'defines': [
	    'COMPILED_FROM_DSP'
	  ]
        }],	
      ],
      'sources' : [
        'lib/xmlparse.c',
        'lib/xmlrole.c',
        'lib/xmltok.c'
      ],
      'dependencies': [
      ],
      'direct_dependent_settings': {
        'include_dirs': [
          'lib'
        ],
      },
    }
  ]
}

